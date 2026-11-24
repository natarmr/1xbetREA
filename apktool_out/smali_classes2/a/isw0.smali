.class public final La/isw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tmw0;


# static fields
.field public static final d:[B

.field public static final e:Ljava/util/Set;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/fpw0;

.field public final c:La/tmw0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, La/isw0;->d:[B

    .line 5
    .line 6
    new-instance v0, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/isw0;->e:Ljava/util/Set;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(La/bfx0;La/tmw0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, La/bfx0;->C()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/isw0;->e:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, La/bfx0;->C()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/isw0;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1}, La/bfx0;->u(La/bfx0;)La/zex0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v0, 0x4

    .line 27
    invoke-virtual {p1, v0}, La/zex0;->h(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, La/hkw0;->c()La/jkw0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, La/bfx0;

    .line 35
    .line 36
    invoke-virtual {p1}, La/ojw0;->c()[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, La/ktt0;->E([B)La/fpw0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, La/isw0;->b:La/fpw0;

    .line 45
    .line 46
    iput-object p2, p0, La/isw0;->c:La/tmw0;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-virtual {p1}, La/bfx0;->C()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "Unsupported DEK key type: "

    .line 54
    .line 55
    const-string p2, ". Only Tink AEAD key types are supported."

    .line 56
    .line 57
    invoke-static {p1, p0, p2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    const/16 v2, 0x1000

    .line 12
    .line 13
    if-gt v1, v2, :cond_0

    .line 14
    .line 15
    array-length p1, p1

    .line 16
    add-int/lit8 p1, p1, -0x4

    .line 17
    .line 18
    if-gt v1, p1, :cond_0

    .line 19
    .line 20
    new-array p1, v1, [B

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, p1, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-array v1, v1, [B

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, La/isw0;->c:La/tmw0;

    .line 40
    .line 41
    sget-object v3, La/isw0;->d:[B

    .line 42
    .line 43
    invoke-interface {v0, p1, v3}, La/tmw0;->b([B[B)[B

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p0, p0, La/isw0;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_2

    .line 48
    .line 49
    :try_start_1
    sget-object v0, La/sjw0;->b:La/vjw0;

    .line 50
    .line 51
    array-length v0, p1

    .line 52
    invoke-static {p1, v2, v0}, La/sjw0;->h([BII)La/vjw0;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    :try_start_2
    sget-object v0, La/hbb;->j:La/hbb;

    .line 57
    .line 58
    sget-object v2, La/lpw0;->e:La/lpw0;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-static {p0, p1, v0, v2, v3}, La/vkr0;->C(Ljava/lang/String;La/sjw0;La/hbb;La/lpw0;Ljava/lang/Integer;)La/vkr0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object p1, La/k6x0;->b:La/k6x0;
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 66
    .line 67
    :try_start_3
    iget-object p1, p1, La/k6x0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, La/u7x0;

    .line 74
    .line 75
    invoke-virtual {p1, p0}, La/u7x0;->c(La/vkr0;)La/atm0;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 79
    :try_start_4
    sget-object p1, La/n6x0;->b:La/n6x0;

    .line 80
    .line 81
    const-class v0, La/tmw0;

    .line 82
    .line 83
    invoke-virtual {p1, p0, v0}, La/n6x0;->a(La/atm0;Ljava/lang/Class;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/tmw0;

    .line 88
    .line 89
    invoke-interface {p0, v1, p2}, La/tmw0;->b([B[B)[B

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :catch_0
    move-exception p0

    .line 95
    goto :goto_0

    .line 96
    :catch_1
    move-exception p0

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 99
    .line 100
    const-string p1, "length of encrypted DEK too large"

    .line 101
    .line 102
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 106
    :catch_2
    move-exception p0

    .line 107
    :goto_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 108
    .line 109
    const-string p2, "invalid ciphertext"

    .line 110
    .line 111
    invoke-direct {p1, p2, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw p1
.end method

.method public final c([B[B)[B
    .locals 4

    .line 1
    sget-object v0, La/b6x0;->b:La/b6x0;

    .line 2
    .line 3
    iget-object v1, p0, La/isw0;->b:La/fpw0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, La/b6x0;->b(La/fpw0;Ljava/lang/Integer;)La/atm0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, La/k6x0;->b:La/k6x0;

    .line 11
    .line 12
    iget-object v1, v1, La/k6x0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/u7x0;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, La/u7x0;->a(La/atm0;)La/vkr0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, La/vkr0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/sjw0;

    .line 27
    .line 28
    invoke-virtual {v1}, La/sjw0;->r()[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object p0, p0, La/isw0;->c:La/tmw0;

    .line 33
    .line 34
    sget-object v3, La/isw0;->d:[B

    .line 35
    .line 36
    invoke-interface {p0, v1, v3}, La/tmw0;->c([B[B)[B

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    array-length v1, p0

    .line 41
    const/16 v3, 0x1000

    .line 42
    .line 43
    if-gt v1, v3, :cond_0

    .line 44
    .line 45
    sget-object v1, La/n6x0;->b:La/n6x0;

    .line 46
    .line 47
    const-class v2, La/tmw0;

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, La/n6x0;->a(La/atm0;Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, La/tmw0;

    .line 54
    .line 55
    invoke-interface {v0, p1, p2}, La/tmw0;->c([B[B)[B

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    array-length p2, p0

    .line 60
    add-int/lit8 p2, p2, 0x4

    .line 61
    .line 62
    array-length v0, p1

    .line 63
    add-int/2addr p2, v0

    .line 64
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    array-length v0, p0

    .line 69
    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_0
    const-string p0, "length of encrypted DEK too large"

    .line 87
    .line 88
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v2
.end method
