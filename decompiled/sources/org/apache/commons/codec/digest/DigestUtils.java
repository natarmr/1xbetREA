package org.apache.commons.codec.digest;

import a.atm0;
import a.yvv;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class DigestUtils {
    static final int BUFFER_SIZE = 1024;
    private final MessageDigest messageDigest;

    public DigestUtils(String str) {
        this(getDigest(str));
    }

    public static MessageDigest getDigest(String str) {
        try {
            return getMessageDigest(str);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static MessageDigest getMd2Digest() {
        return getDigest("MD2");
    }

    public static MessageDigest getMd5Digest() {
        return getDigest(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM);
    }

    private static MessageDigest getMessageDigest(String str) {
        return MessageDigest.getInstance(str);
    }

    public static MessageDigest getSha1Digest() {
        return getDigest("SHA-1");
    }

    public static MessageDigest getSha256Digest() {
        return getDigest("SHA-256");
    }

    public static MessageDigest getSha384Digest() {
        return getDigest("SHA-384");
    }

    public static MessageDigest getSha3_224Digest() {
        return getDigest("SHA3-224");
    }

    public static MessageDigest getSha3_256Digest() {
        return getDigest("SHA3-256");
    }

    public static MessageDigest getSha3_384Digest() {
        return getDigest("SHA3-384");
    }

    public static MessageDigest getSha3_512Digest() {
        return getDigest("SHA3-512");
    }

    public static MessageDigest getSha512Digest() {
        return getDigest("SHA-512");
    }

    public static MessageDigest getSha512_224Digest() {
        return getDigest("SHA-512/224");
    }

    public static MessageDigest getSha512_256Digest() {
        return getDigest("SHA-512/256");
    }

    @Deprecated
    public static MessageDigest getShaDigest() {
        return getSha1Digest();
    }

    public static MessageDigest getShake128_256Digest() {
        return getDigest("SHAKE128-256");
    }

    public static MessageDigest getShake256_512Digest() {
        return getDigest("SHAKE256-512");
    }

    public static boolean isAvailable(String str) {
        return getDigest(str, null) != null;
    }

    public static byte[] md2(byte[] bArr) {
        return getMd2Digest().digest(bArr);
    }

    public static String md2Hex(byte[] bArr) {
        return yvv.a(md2(bArr));
    }

    public static byte[] md5(byte[] bArr) {
        return getMd5Digest().digest(bArr);
    }

    public static String md5Hex(byte[] bArr) {
        return yvv.a(md5(bArr));
    }

    @Deprecated
    public static byte[] sha(byte[] bArr) {
        return sha1(bArr);
    }

    public static byte[] sha1(byte[] bArr) {
        return getSha1Digest().digest(bArr);
    }

    public static String sha1Hex(byte[] bArr) {
        return yvv.a(sha1(bArr));
    }

    public static byte[] sha256(byte[] bArr) {
        return getSha256Digest().digest(bArr);
    }

    public static String sha256Hex(byte[] bArr) {
        return yvv.a(sha256(bArr));
    }

    public static byte[] sha384(byte[] bArr) {
        return getSha384Digest().digest(bArr);
    }

    public static String sha384Hex(byte[] bArr) {
        return yvv.a(sha384(bArr));
    }

    public static byte[] sha3_224(byte[] bArr) {
        return getSha3_224Digest().digest(bArr);
    }

    public static String sha3_224Hex(byte[] bArr) {
        return yvv.a(sha3_224(bArr));
    }

    public static byte[] sha3_256(byte[] bArr) {
        return getSha3_256Digest().digest(bArr);
    }

    public static String sha3_256Hex(byte[] bArr) {
        return yvv.a(sha3_256(bArr));
    }

    public static byte[] sha3_384(byte[] bArr) {
        return getSha3_384Digest().digest(bArr);
    }

    public static String sha3_384Hex(byte[] bArr) {
        return yvv.a(sha3_384(bArr));
    }

    public static byte[] sha3_512(byte[] bArr) {
        return getSha3_512Digest().digest(bArr);
    }

    public static String sha3_512Hex(byte[] bArr) {
        return yvv.a(sha3_512(bArr));
    }

    public static byte[] sha512(byte[] bArr) {
        return getSha512Digest().digest(bArr);
    }

    public static String sha512Hex(byte[] bArr) {
        return yvv.a(sha512(bArr));
    }

    public static byte[] sha512_224(byte[] bArr) {
        return getSha512_224Digest().digest(bArr);
    }

    public static String sha512_224Hex(byte[] bArr) {
        return yvv.a(sha512_224(bArr));
    }

    public static byte[] sha512_256(byte[] bArr) {
        return getSha512_256Digest().digest(bArr);
    }

    public static String sha512_256Hex(byte[] bArr) {
        return yvv.a(sha512_256(bArr));
    }

    @Deprecated
    public static String shaHex(byte[] bArr) {
        return sha1Hex(bArr);
    }

    public static byte[] shake128_256(byte[] bArr) {
        return getShake128_256Digest().digest(bArr);
    }

    public static String shake128_256Hex(byte[] bArr) {
        return yvv.a(shake128_256(bArr));
    }

    public static byte[] shake256_512(byte[] bArr) {
        return getShake256_512Digest().digest(bArr);
    }

    public static String shake256_512Hex(byte[] bArr) {
        return yvv.a(shake256_512(bArr));
    }

    public static MessageDigest updateDigest(MessageDigest messageDigest, Path path, OpenOption... openOptionArr) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(path, openOptionArr));
        try {
            MessageDigest messageDigestUpdateDigest = updateDigest(messageDigest, bufferedInputStream);
            bufferedInputStream.close();
            return messageDigestUpdateDigest;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public byte[] digest(byte[] bArr) {
        return updateDigest(this.messageDigest, bArr).digest();
    }

    public String digestAsHex(byte[] bArr) {
        return yvv.a(digest(bArr));
    }

    @Deprecated
    public static byte[] sha(InputStream inputStream) {
        return sha1(inputStream);
    }

    @Deprecated
    public static String shaHex(InputStream inputStream) {
        return sha1Hex(inputStream);
    }

    public MessageDigest getMessageDigest() {
        return this.messageDigest;
    }

    @Deprecated
    public static byte[] sha(String str) {
        return sha1(str);
    }

    @Deprecated
    public static String shaHex(String str) {
        return sha1Hex(str);
    }

    public DigestUtils(MessageDigest messageDigest) {
        this.messageDigest = messageDigest;
    }

    public static byte[] md2(InputStream inputStream) {
        return digest(getMd2Digest(), inputStream);
    }

    public static String md2Hex(InputStream inputStream) {
        return yvv.a(md2(inputStream));
    }

    public static byte[] md5(InputStream inputStream) {
        return digest(getMd5Digest(), inputStream);
    }

    public static String md5Hex(InputStream inputStream) {
        return yvv.a(md5(inputStream));
    }

    public static byte[] sha1(InputStream inputStream) {
        return digest(getSha1Digest(), inputStream);
    }

    public static String sha1Hex(InputStream inputStream) {
        return yvv.a(sha1(inputStream));
    }

    public static byte[] sha256(InputStream inputStream) {
        return digest(getSha256Digest(), inputStream);
    }

    public static String sha256Hex(InputStream inputStream) {
        return yvv.a(sha256(inputStream));
    }

    public static byte[] sha384(InputStream inputStream) {
        return digest(getSha384Digest(), inputStream);
    }

    public static String sha384Hex(InputStream inputStream) {
        return yvv.a(sha384(inputStream));
    }

    public static byte[] sha3_224(InputStream inputStream) {
        return digest(getSha3_224Digest(), inputStream);
    }

    public static String sha3_224Hex(InputStream inputStream) {
        return yvv.a(sha3_224(inputStream));
    }

    public static byte[] sha3_256(InputStream inputStream) {
        return digest(getSha3_256Digest(), inputStream);
    }

    public static String sha3_256Hex(InputStream inputStream) {
        return yvv.a(sha3_256(inputStream));
    }

    public static byte[] sha3_384(InputStream inputStream) {
        return digest(getSha3_384Digest(), inputStream);
    }

    public static String sha3_384Hex(InputStream inputStream) {
        return yvv.a(sha3_384(inputStream));
    }

    public static byte[] sha3_512(InputStream inputStream) {
        return digest(getSha3_512Digest(), inputStream);
    }

    public static String sha3_512Hex(InputStream inputStream) {
        return yvv.a(sha3_512(inputStream));
    }

    public static byte[] sha512(InputStream inputStream) {
        return digest(getSha512Digest(), inputStream);
    }

    public static String sha512Hex(InputStream inputStream) {
        return yvv.a(sha512(inputStream));
    }

    public static byte[] sha512_224(InputStream inputStream) {
        return digest(getSha512_224Digest(), inputStream);
    }

    public static String sha512_224Hex(InputStream inputStream) {
        return yvv.a(sha512_224(inputStream));
    }

    public static byte[] sha512_256(InputStream inputStream) {
        return digest(getSha512_256Digest(), inputStream);
    }

    public static String sha512_256Hex(InputStream inputStream) {
        return yvv.a(sha512_256(inputStream));
    }

    public static byte[] shake128_256(InputStream inputStream) {
        return digest(getShake128_256Digest(), inputStream);
    }

    public static String shake128_256Hex(InputStream inputStream) {
        return yvv.a(shake128_256(inputStream));
    }

    public static byte[] shake256_512(InputStream inputStream) {
        return digest(getShake256_512Digest(), inputStream);
    }

    public static String shake256_512Hex(InputStream inputStream) {
        return yvv.a(shake256_512(inputStream));
    }

    public String digestAsHex(ByteBuffer byteBuffer) {
        return yvv.a(digest(byteBuffer));
    }

    @Deprecated
    public DigestUtils() {
        this.messageDigest = null;
    }

    public static byte[] md2(String str) {
        return md2(atm0.l(str));
    }

    public static String md2Hex(String str) {
        return yvv.a(md2(str));
    }

    public static byte[] md5(String str) {
        return md5(atm0.l(str));
    }

    public static String md5Hex(String str) {
        return yvv.a(md5(str));
    }

    public static byte[] sha1(String str) {
        return sha1(atm0.l(str));
    }

    public static String sha1Hex(String str) {
        return yvv.a(sha1(str));
    }

    public static byte[] sha256(String str) {
        return sha256(atm0.l(str));
    }

    public static String sha256Hex(String str) {
        return yvv.a(sha256(str));
    }

    public static byte[] sha384(String str) {
        return sha384(atm0.l(str));
    }

    public static String sha384Hex(String str) {
        return yvv.a(sha384(str));
    }

    public static byte[] sha3_224(String str) {
        return sha3_224(atm0.l(str));
    }

    public static String sha3_224Hex(String str) {
        return yvv.a(sha3_224(str));
    }

    public static byte[] sha3_256(String str) {
        return sha3_256(atm0.l(str));
    }

    public static String sha3_256Hex(String str) {
        return yvv.a(sha3_256(str));
    }

    public static byte[] sha3_384(String str) {
        return sha3_384(atm0.l(str));
    }

    public static String sha3_384Hex(String str) {
        return yvv.a(sha3_384(str));
    }

    public static byte[] sha3_512(String str) {
        return sha3_512(atm0.l(str));
    }

    public static String sha3_512Hex(String str) {
        return yvv.a(sha3_512(str));
    }

    public static byte[] sha512(String str) {
        return sha512(atm0.l(str));
    }

    public static String sha512Hex(String str) {
        return yvv.a(sha512(str));
    }

    public static byte[] sha512_224(String str) {
        return sha512_224(atm0.l(str));
    }

    public static String sha512_224Hex(String str) {
        return yvv.a(sha512_224(str));
    }

    public static byte[] sha512_256(String str) {
        return sha512_256(atm0.l(str));
    }

    public static String sha512_256Hex(String str) {
        return yvv.a(sha512_256(str));
    }

    public static byte[] shake128_256(String str) {
        return shake128_256(atm0.l(str));
    }

    public static String shake128_256Hex(String str) {
        return yvv.a(shake128_256(str));
    }

    public static byte[] shake256_512(String str) {
        return shake256_512(atm0.l(str));
    }

    public static String shake256_512Hex(String str) {
        return yvv.a(shake256_512(str));
    }

    public String digestAsHex(File file) {
        return yvv.a(digest(file));
    }

    public static byte[] digest(MessageDigest messageDigest, ByteBuffer byteBuffer) {
        messageDigest.update(byteBuffer);
        return messageDigest.digest();
    }

    public String digestAsHex(InputStream inputStream) {
        return yvv.a(digest(inputStream));
    }

    public static MessageDigest getDigest(String str, MessageDigest messageDigest) {
        try {
            return getMessageDigest(str);
        } catch (Exception unused) {
            return messageDigest;
        }
    }

    public String digestAsHex(Path path, OpenOption... openOptionArr) {
        return yvv.a(digest(path, openOptionArr));
    }

    public static byte[] digest(MessageDigest messageDigest, File file) {
        return updateDigest(messageDigest, file).digest();
    }

    public String digestAsHex(String str) {
        return yvv.a(digest(str));
    }

    public static byte[] digest(MessageDigest messageDigest, InputStream inputStream) {
        return updateDigest(messageDigest, inputStream).digest();
    }

    public static byte[] digest(MessageDigest messageDigest, Path path, OpenOption... openOptionArr) {
        return updateDigest(messageDigest, path, openOptionArr).digest();
    }

    public static byte[] digest(MessageDigest messageDigest, RandomAccessFile randomAccessFile) {
        return updateDigest(messageDigest, randomAccessFile).digest();
    }

    public static byte[] digest(MessageDigest messageDigest, byte[] bArr) {
        return messageDigest.digest(bArr);
    }

    public byte[] digest(ByteBuffer byteBuffer) {
        return updateDigest(this.messageDigest, byteBuffer).digest();
    }

    public byte[] digest(File file) {
        return updateDigest(this.messageDigest, file).digest();
    }

    public byte[] digest(InputStream inputStream) {
        return updateDigest(this.messageDigest, inputStream).digest();
    }

    public byte[] digest(Path path, OpenOption... openOptionArr) {
        return updateDigest(this.messageDigest, path, openOptionArr).digest();
    }

    public byte[] digest(String str) {
        return updateDigest(this.messageDigest, str).digest();
    }

    public static MessageDigest updateDigest(MessageDigest messageDigest, ByteBuffer byteBuffer) {
        messageDigest.update(byteBuffer);
        return messageDigest;
    }

    public static MessageDigest updateDigest(MessageDigest messageDigest, File file) {
        return updateDigest(messageDigest, file.toPath(), new OpenOption[0]);
    }

    private static MessageDigest updateDigest(MessageDigest messageDigest, FileChannel fileChannel) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(BUFFER_SIZE);
        while (fileChannel.read(byteBufferAllocate) > 0) {
            byteBufferAllocate.flip();
            messageDigest.update(byteBufferAllocate);
            byteBufferAllocate.clear();
        }
        return messageDigest;
    }

    public static MessageDigest updateDigest(MessageDigest messageDigest, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[BUFFER_SIZE];
        int i = inputStream.read(bArr, 0, BUFFER_SIZE);
        while (i > -1) {
            messageDigest.update(bArr, 0, i);
            i = inputStream.read(bArr, 0, BUFFER_SIZE);
        }
        return messageDigest;
    }

    public static MessageDigest updateDigest(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        return messageDigest;
    }

    public static MessageDigest updateDigest(MessageDigest messageDigest, RandomAccessFile randomAccessFile) {
        return updateDigest(messageDigest, randomAccessFile.getChannel());
    }

    public static MessageDigest updateDigest(MessageDigest messageDigest, String str) {
        messageDigest.update(atm0.l(str));
        return messageDigest;
    }
}
