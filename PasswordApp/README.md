# PasswordApp (Android)

Aplikasi Android sederhana yang meminta password saat dibuka.

PENTING: Password demo adalah `1234` (di `strings.xml`). Ubah sebelum rilis produksi.

## Fitur
- Dialog password saat aplikasi diluncurkan
- Validasi sederhana

## Menjalankan (Android Studio)
1. Buka Android Studio.
2. File -> Open -> pilih folder `PasswordApp`.
3. Tunggu sinkronisasi Gradle.
4. Pilih device/emulator lalu Run.

## Mengubah Password
Edit `app/src/main/res/values/strings.xml` dan ubah `app_password`.

## Catatan Keamanan
- Jangan simpan password plaintext untuk produksi.
- Pertimbangkan enkripsi/secure storage.

## Berkas Utama
- `app/src/main/java/com/example/passwordapp/MainActivity.kt`
- `app/src/main/res/layout/dialog_password.xml`
- `app/src/main/res/values/strings.xml`