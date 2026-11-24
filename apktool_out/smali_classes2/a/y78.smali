.class public final La/y78;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;
.implements La/qgk0;
.implements La/s1x0;


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    .line 1
    iput-byte p1, p0, La/y78;->a:B

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, La/y78;->b:I

    .line 11
    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/fq80;

    .line 24
    .line 25
    const/16 v0, 0x8

    .line 26
    .line 27
    invoke-direct {p1, v0}, La/fq80;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 53
    .line 54
    return-void

    .line 55
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    const/16 p1, 0xff

    .line 59
    .line 60
    iput p1, p0, La/y78;->b:I

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_3
        0xe -> :sswitch_2
        0xf -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 73
    iput-byte p1, p0, La/y78;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/brw0;)V
    .locals 1

    const/16 v0, 0x16

    iput-byte v0, p0, La/y78;->a:B

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 76
    iget v0, p1, La/brw0;->a:I

    .line 77
    iget p1, p1, La/brw0;->b:I

    add-int/2addr v0, p1

    .line 78
    iput v0, p0, La/y78;->b:I

    return-void
.end method

.method public constructor <init>(La/ctf0;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/y78;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    const v0, 0x7f0606c1

    .line 84
    invoke-virtual {p1, v0}, La/ctf0;->a(I)I

    move-result p1

    iput p1, p0, La/y78;->b:I

    return-void
.end method

.method public constructor <init>(La/k1a;)V
    .locals 1

    const/16 v0, 0x13

    iput-byte v0, p0, La/y78;->a:B

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 93
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result p1

    add-int/lit8 p1, p1, -0x2

    const/4 v0, 0x4

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, La/y78;->b:I

    return-void
.end method

.method public constructor <init>(La/udg0;I)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, La/y78;->a:B

    .line 94
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 95
    iput-byte v0, p0, La/y78;->a:B

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput p2, p0, La/y78;->b:I

    return-void
.end method

.method public constructor <init>(La/y78;)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, La/y78;->a:B

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 80
    iget p1, p1, La/y78;->b:I

    .line 81
    iput p1, p0, La/y78;->b:I

    return-void
.end method

.method public constructor <init>(La/zyw0;)V
    .locals 1

    const/16 v0, 0x17

    iput-byte v0, p0, La/y78;->a:B

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 71
    iget p1, p1, La/zyw0;->a:I

    .line 72
    iput p1, p0, La/y78;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 1

    const/16 v0, 0x15

    iput-byte v0, p0, La/y78;->a:B

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    iput p2, p0, La/y78;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 67
    iput-byte p3, p0, La/y78;->a:B

    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    iput p2, p0, La/y78;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, La/y78;->a:B

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 99
    :goto_1
    iput p1, p0, La/y78;->b:I

    return-void
.end method

.method public constructor <init>([II)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/y78;->a:B

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput p2, p0, La/y78;->b:I

    .line 87
    sget-object p2, La/t3x;->c:La/t3x;

    if-eqz p1, :cond_1

    .line 88
    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, La/t3x;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    .line 89
    array-length v0, p1

    invoke-direct {p2, p1, v0}, La/t3x;-><init>([II)V

    .line 90
    :cond_1
    :goto_0
    iput-object p2, p0, La/y78;->c:Ljava/lang/Object;

    return-void
.end method

.method public static e(Landroid/text/SpannableStringBuilder;La/d0t;)V
    .locals 7

    .line 1
    iget-object v0, p1, La/d0t;->p:La/rqs;

    .line 2
    .line 3
    iget-object v0, v0, La/rqs;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_2

    .line 18
    .line 19
    iget-wide v1, p1, La/d0t;->s:J

    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide/16 v5, 0x3e8

    .line 26
    .line 27
    div-long/2addr v3, v5

    .line 28
    sub-long/2addr v1, v3

    .line 29
    const-wide/16 v3, 0x1

    .line 30
    .line 31
    cmp-long p1, v3, v1

    .line 32
    .line 33
    if-gtz p1, :cond_0

    .line 34
    .line 35
    const-wide/16 v3, 0x5460

    .line 36
    .line 37
    cmp-long p1, v1, v3

    .line 38
    .line 39
    if-gez p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-lez p1, :cond_1

    .line 47
    .line 48
    const-string p1, ", "

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, ":memory:"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-gt v3, v0, :cond_5

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    move v5, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v5, v0

    .line 25
    :goto_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/16 v6, 0x20

    .line 30
    .line 31
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-gtz v5, :cond_1

    .line 36
    .line 37
    move v5, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v5, v2

    .line 40
    :goto_2
    if-nez v4, :cond_3

    .line 41
    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    move v4, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    if-nez v5, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    :goto_3
    add-int/2addr v0, v1

    .line 56
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    const-string v0, "deleting the database file: "

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "SupportSQLite"

    .line 78
    .line 79
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 83
    .line 84
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Landroid/database/sqlite/SQLiteDatabase;->deleteDatabase(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catch_0
    move-exception p0

    .line 92
    const-string v0, "delete failed: "

    .line 93
    .line 94
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    .line 96
    .line 97
    :cond_7
    :goto_4
    return-void
.end method

.method public static synthetic n(La/y78;La/d0t;ZZI)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    const/4 p4, 0x0

    .line 7
    invoke-virtual {p0, p1, p2, p4, p3}, La/y78;->m(La/d0t;ZZZ)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic p(La/y78;La/d0t;ZI)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p3, v0

    .line 9
    :goto_0
    invoke-virtual {p0, p1, v0, p3, p2}, La/y78;->o(La/d0t;ZZZ)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public a(I[B[B)[B
    .locals 8

    .line 1
    iget-byte v0, p0, La/y78;->a:B

    .line 2
    .line 3
    const-string v1, "ciphertext too short"

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    array-length v0, p3

    .line 12
    if-lt v0, p1, :cond_b

    .line 13
    .line 14
    array-length v0, p3

    .line 15
    invoke-static {p3, p1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p3, La/mkt0;

    .line 20
    .line 21
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v3, p3, La/mkt0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object v3, p3, La/mkt0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/zyw0;

    .line 31
    .line 32
    iput-object p0, p3, La/mkt0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance p0, La/rkt0;

    .line 35
    .line 36
    invoke-static {p2}, La/icw0;->a([B)La/icw0;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-direct {p0, p2, v2}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    iput-object p0, p3, La/mkt0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {p3}, La/mkt0;->c()La/uyw0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance p2, La/xhx0;

    .line 50
    .line 51
    iget-object p3, p0, La/uyw0;->b:La/rkt0;

    .line 52
    .line 53
    iget-object p3, p3, La/rkt0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p3, La/icw0;

    .line 56
    .line 57
    invoke-virtual {p3}, La/icw0;->b()[B

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    iget-object p0, p0, La/uyw0;->c:La/icw0;

    .line 62
    .line 63
    invoke-direct {p2, p3, p0}, La/xhx0;-><init>([BLa/icw0;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, La/i4w0;->m:[B

    .line 67
    .line 68
    filled-new-array {p0}, [[B

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    array-length p3, p1

    .line 73
    iget-object v0, p2, La/xhx0;->c:[B

    .line 74
    .line 75
    array-length v1, v0

    .line 76
    const/16 v2, 0x10

    .line 77
    .line 78
    add-int/2addr v1, v2

    .line 79
    if-lt p3, v1, :cond_a

    .line 80
    .line 81
    invoke-static {v0, p1}, La/x7x0;->b([B[B)Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_9

    .line 86
    .line 87
    sget-object p3, La/xhx0;->f:La/y50;

    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    check-cast p3, Ljavax/crypto/Cipher;

    .line 94
    .line 95
    array-length v1, v0

    .line 96
    array-length v4, v0

    .line 97
    add-int/2addr v4, v2

    .line 98
    invoke-static {p1, v1, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, [B->clone()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, [B

    .line 107
    .line 108
    const/16 v5, 0x8

    .line 109
    .line 110
    aget-byte v6, v4, v5

    .line 111
    .line 112
    and-int/lit8 v6, v6, 0x7f

    .line 113
    .line 114
    int-to-byte v6, v6

    .line 115
    aput-byte v6, v4, v5

    .line 116
    .line 117
    const/16 v5, 0xc

    .line 118
    .line 119
    aget-byte v6, v4, v5

    .line 120
    .line 121
    and-int/lit8 v6, v6, 0x7f

    .line 122
    .line 123
    int-to-byte v6, v6

    .line 124
    aput-byte v6, v4, v5

    .line 125
    .line 126
    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    .line 127
    .line 128
    iget-object v6, p2, La/xhx0;->b:[B

    .line 129
    .line 130
    const-string v7, "AES"

    .line 131
    .line 132
    invoke-direct {v5, v6, v7}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    new-instance v6, Ljavax/crypto/spec/IvParameterSpec;

    .line 136
    .line 137
    invoke-direct {v6, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 138
    .line 139
    .line 140
    const/4 v4, 0x2

    .line 141
    invoke-virtual {p3, v4, v5, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 142
    .line 143
    .line 144
    array-length v0, v0

    .line 145
    add-int/2addr v0, v2

    .line 146
    array-length v5, p1

    .line 147
    sub-int/2addr v5, v0

    .line 148
    invoke-virtual {p3, p1, v0, v5}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const/4 p3, 0x0

    .line 153
    if-nez v5, :cond_0

    .line 154
    .line 155
    if-nez p1, :cond_0

    .line 156
    .line 157
    const-string v0, "java.vendor"

    .line 158
    .line 159
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v5, "The Android Project"

    .line 164
    .line 165
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_0

    .line 170
    .line 171
    new-array p1, p3, [B

    .line 172
    .line 173
    :cond_0
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p0, [[B

    .line 178
    .line 179
    const/4 v0, 0x1

    .line 180
    aput-object p1, p0, v0

    .line 181
    .line 182
    array-length v4, p0

    .line 183
    iget-object p2, p2, La/xhx0;->a:La/r9x0;

    .line 184
    .line 185
    if-nez v4, :cond_1

    .line 186
    .line 187
    sget-object p0, La/xhx0;->e:[B

    .line 188
    .line 189
    invoke-interface {p2, p0, v2}, La/r9x0;->e([BI)[B

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    goto :goto_2

    .line 194
    :cond_1
    sget-object v4, La/xhx0;->d:[B

    .line 195
    .line 196
    invoke-interface {p2, v4, v2}, La/r9x0;->e([BI)[B

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    move v5, p3

    .line 201
    :goto_0
    array-length v6, p0

    .line 202
    sub-int/2addr v6, v0

    .line 203
    if-ge v5, v6, :cond_3

    .line 204
    .line 205
    aget-object v6, p0, v5

    .line 206
    .line 207
    if-nez v6, :cond_2

    .line 208
    .line 209
    new-array v6, p3, [B

    .line 210
    .line 211
    :cond_2
    invoke-static {v4}, La/idm0;->B([B)[B

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-interface {p2, v6, v2}, La/r9x0;->e([BI)[B

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {v4, v6}, La/egm0;->A([B[B)[B

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    add-int/lit8 v5, v5, 0x1

    .line 224
    .line 225
    goto :goto_0

    .line 226
    :cond_3
    array-length v5, p0

    .line 227
    sub-int/2addr v5, v0

    .line 228
    aget-object p0, p0, v5

    .line 229
    .line 230
    array-length v0, p0

    .line 231
    if-lt v0, v2, :cond_5

    .line 232
    .line 233
    array-length v0, p0

    .line 234
    array-length v5, v4

    .line 235
    if-lt v0, v5, :cond_4

    .line 236
    .line 237
    array-length v0, p0

    .line 238
    array-length v3, v4

    .line 239
    sub-int/2addr v0, v3

    .line 240
    array-length v3, p0

    .line 241
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    :goto_1
    array-length v3, v4

    .line 246
    if-ge p3, v3, :cond_6

    .line 247
    .line 248
    add-int v3, v0, p3

    .line 249
    .line 250
    aget-byte v5, p0, v3

    .line 251
    .line 252
    aget-byte v6, v4, p3

    .line 253
    .line 254
    xor-int/2addr v5, v6

    .line 255
    int-to-byte v5, v5

    .line 256
    aput-byte v5, p0, v3

    .line 257
    .line 258
    add-int/lit8 p3, p3, 0x1

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_4
    const-string p0, "xorEnd requires a.length >= b.length"

    .line 262
    .line 263
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_5
    array-length p3, p0

    .line 268
    if-ge p3, v2, :cond_8

    .line 269
    .line 270
    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 271
    .line 272
    .line 273
    move-result-object p3

    .line 274
    array-length p0, p0

    .line 275
    const/16 v0, -0x80

    .line 276
    .line 277
    aput-byte v0, p3, p0

    .line 278
    .line 279
    invoke-static {v4}, La/idm0;->B([B)[B

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-static {p3, p0}, La/egm0;->A([B[B)[B

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    :cond_6
    invoke-interface {p2, p0, v2}, La/r9x0;->e([BI)[B

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    :goto_2
    invoke-static {v1, p0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 292
    .line 293
    .line 294
    move-result p0

    .line 295
    if-eqz p0, :cond_7

    .line 296
    .line 297
    move-object v3, p1

    .line 298
    goto :goto_3

    .line 299
    :cond_7
    new-instance p0, Ljavax/crypto/AEADBadTagException;

    .line 300
    .line 301
    const-string p1, "Integrity check failed."

    .line 302
    .line 303
    invoke-direct {p0, p1}, Ljavax/crypto/AEADBadTagException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw p0

    .line 307
    :cond_8
    const-string p0, "x must be smaller than a block."

    .line 308
    .line 309
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_9
    const-string p0, "Decryption failed (OutputPrefix mismatch)."

    .line 314
    .line 315
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_a
    const-string p0, "Ciphertext too short."

    .line 320
    .line 321
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_b
    invoke-static {v1}, La/hny;->o(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :goto_3
    return-object v3

    .line 329
    :pswitch_0
    array-length v0, p3

    .line 330
    if-lt v0, p1, :cond_c

    .line 331
    .line 332
    array-length v0, p3

    .line 333
    invoke-static {p3, p1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast p0, La/brw0;

    .line 340
    .line 341
    iget p3, p0, La/brw0;->a:I

    .line 342
    .line 343
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 344
    .line 345
    .line 346
    move-result-object p3

    .line 347
    iget v0, p0, La/brw0;->a:I

    .line 348
    .line 349
    iget v1, p0, La/brw0;->b:I

    .line 350
    .line 351
    add-int/2addr v1, v0

    .line 352
    invoke-static {p2, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    new-instance v0, La/h0q0;

    .line 357
    .line 358
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 359
    .line 360
    .line 361
    iput-object v3, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 362
    .line 363
    iput-object v3, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v3, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 366
    .line 367
    iput-object p0, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 368
    .line 369
    new-instance p0, La/rkt0;

    .line 370
    .line 371
    invoke-static {p3}, La/icw0;->a([B)La/icw0;

    .line 372
    .line 373
    .line 374
    move-result-object p3

    .line 375
    invoke-direct {p0, p3, v2}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 376
    .line 377
    .line 378
    iput-object p0, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 379
    .line 380
    new-instance p0, La/rkt0;

    .line 381
    .line 382
    invoke-static {p2}, La/icw0;->a([B)La/icw0;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-direct {p0, p2, v2}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 387
    .line 388
    .line 389
    iput-object p0, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 390
    .line 391
    invoke-virtual {v0}, La/h0q0;->C()La/uqw0;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    invoke-static {p0}, La/hix0;->a(La/uqw0;)La/hix0;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    sget-object p2, La/i4w0;->m:[B

    .line 400
    .line 401
    invoke-virtual {p0, p1, p2}, La/hix0;->b([B[B)[B

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    goto :goto_4

    .line 406
    :cond_c
    invoke-static {v1}, La/hny;->o(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    :goto_4
    return-object v3

    .line 410
    nop

    .line 411
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Landroid/text/SpannableStringBuilder;La/d0t;)V
    .locals 4

    .line 1
    iget-object v0, p2, La/d0t;->p:La/rqs;

    .line 2
    .line 3
    iget-object v0, v0, La/rqs;->m:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, La/rdj;->a:La/rdj;

    .line 20
    .line 21
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/ctf0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/ctf0;->h()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    iget-wide v0, p2, La/d0t;->s:J

    .line 30
    .line 31
    sget-object p2, La/efj;->c:La/efj;

    .line 32
    .line 33
    new-instance v3, La/znq0;

    .line 34
    .line 35
    invoke-direct {v3, v0, v1}, La/znq0;-><init>(J)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 v0, 0x0

    .line 43
    const/16 v1, 0x38

    .line 44
    .line 45
    invoke-static {v3, p2, p0, v0, v1}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object v0, p0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v0, v2

    .line 52
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p1}, La/ttm0;->J(Ljava/lang/CharSequence;)C

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const/16 p2, 0x2c

    .line 64
    .line 65
    if-ne p0, p2, :cond_3

    .line 66
    .line 67
    const-string v2, " "

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    const-string v2, ", "

    .line 71
    .line 72
    :goto_1
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_4

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p1, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 83
    .line 84
    .line 85
    :cond_4
    return-void
.end method

.method public d(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, ", "

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/ctf0;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    new-array v1, v0, [Ljava/lang/Object;

    .line 24
    .line 25
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 26
    .line 27
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const v1, 0x7f1311b8

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p1, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, " "

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 44
    .line 45
    .line 46
    new-instance p0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v0, "\u2066"

    .line 49
    .line 50
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p2, "\u2069"

    .line 57
    .line 58
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void
.end method

.method public f(Landroid/text/SpannableStringBuilder;La/d0t;Z)V
    .locals 9

    .line 1
    iget-object v0, p2, La/d0t;->p:La/rqs;

    .line 2
    .line 3
    iget-wide v1, v0, La/rqs;->j:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v3, v1, v3

    .line 8
    .line 9
    if-eqz v3, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    const-string v3, ","

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 20
    .line 21
    .line 22
    :cond_0
    if-eqz p3, :cond_3

    .line 23
    .line 24
    iget-boolean v3, v0, La/rqs;->z:Z

    .line 25
    .line 26
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 27
    .line 28
    const-wide/16 v5, 0x3c

    .line 29
    .line 30
    div-long v7, v1, v5

    .line 31
    .line 32
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    rem-long/2addr v1, v5

    .line 37
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    filled-new-array {v7, v1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x2

    .line 46
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "%02d:%02d"

    .line 51
    .line 52
    invoke-static {v4, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-boolean v0, v0, La/rqs;->p:Z

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    if-eqz v3, :cond_2

    .line 62
    .line 63
    const v0, 0x7f130b31

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const v0, 0x7f130b32

    .line 68
    .line 69
    .line 70
    :goto_0
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/ctf0;

    .line 73
    .line 74
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p0, v0, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_1
    const-string p0, " "

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p1, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-static {p2}, La/qzb;->b0(La/d0t;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-eqz p3, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-lez p2, :cond_4

    .line 109
    .line 110
    new-instance p2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string p3, " ("

    .line 113
    .line 114
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p0, ")"

    .line 121
    .line 122
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p1, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 130
    .line 131
    .line 132
    :cond_4
    return-void
.end method

.method public g(Landroid/text/SpannableStringBuilder;La/d0t;)V
    .locals 4

    .line 1
    iget-wide v0, p2, La/d0t;->s:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, La/rdj;->a:La/rdj;

    .line 10
    .line 11
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/ctf0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/ctf0;->h()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    iget-wide v0, p2, La/d0t;->s:J

    .line 20
    .line 21
    sget-object p2, La/efj;->c:La/efj;

    .line 22
    .line 23
    new-instance v2, La/znq0;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1}, La/znq0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x0

    .line 33
    const/16 v1, 0x38

    .line 34
    .line 35
    invoke-static {v2, p2, p0, v0, v1}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, " "

    .line 42
    .line 43
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public h()V
    .locals 7

    .line 1
    iget v0, p0, La/y78;->b:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, La/y78;->b:I

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    if-lt v0, v1, :cond_5

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, La/y78;->b:I

    .line 13
    .line 14
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x1

    .line 43
    if-gt v2, v3, :cond_2

    .line 44
    .line 45
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/rbe0;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    iget-object v1, v1, La/rbe0;->a:Ljava/lang/ref/WeakReference;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, La/dyw;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v1, 0x0

    .line 63
    :goto_1
    if-nez v1, :cond_0

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move v3, v0

    .line 74
    move v4, v3

    .line 75
    :goto_2
    if-ge v3, v2, :cond_4

    .line 76
    .line 77
    sub-int v5, v3, v4

    .line 78
    .line 79
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    check-cast v6, La/rbe0;

    .line 84
    .line 85
    iget-object v6, v6, La/rbe0;->a:Ljava/lang/ref/WeakReference;

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    if-nez v6, :cond_3

    .line 92
    .line 93
    invoke-interface {v1, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_0

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    return-void
.end method

.method public j(II)V
    .locals 2

    .line 1
    add-int/2addr p2, p1

    .line 2
    iget-object v0, p0, La/y78;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, [C

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    if-gt v1, p2, :cond_1

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0x2

    .line 10
    .line 11
    if-ge p2, p1, :cond_0

    .line 12
    .line 13
    move p2, p1

    .line 14
    :cond_0
    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public k(La/d0t;Z)Ljava/lang/CharSequence;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget v1, v1, La/y78;->b:I

    .line 6
    .line 7
    iget-object v2, v0, La/d0t;->p:La/rqs;

    .line 8
    .line 9
    iget-object v3, v2, La/rqs;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, La/cy7;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    move v4, v6

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v4, v5

    .line 24
    :goto_0
    new-instance v7, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v8, 0xa

    .line 27
    .line 28
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    move v9, v5

    .line 40
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    const-string v13, "-"

    .line 45
    .line 46
    if-eqz v10, :cond_9

    .line 47
    .line 48
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    add-int/lit8 v11, v9, 0x1

    .line 53
    .line 54
    if-ltz v9, :cond_8

    .line 55
    .line 56
    check-cast v10, La/df90;

    .line 57
    .line 58
    iget-object v10, v10, La/df90;->b:La/tf90;

    .line 59
    .line 60
    iget v12, v10, La/tf90;->b:I

    .line 61
    .line 62
    iget v10, v10, La/tf90;->c:I

    .line 63
    .line 64
    invoke-static {v3}, La/q3d;->i(Ljava/util/List;)I

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    if-ne v9, v14, :cond_6

    .line 69
    .line 70
    iget v9, v2, La/rqs;->g:I

    .line 71
    .line 72
    const-string v14, "*-"

    .line 73
    .line 74
    const-string v15, "-*"

    .line 75
    .line 76
    if-eq v9, v6, :cond_4

    .line 77
    .line 78
    const/4 v6, 0x2

    .line 79
    if-eq v9, v6, :cond_2

    .line 80
    .line 81
    if-nez v4, :cond_1

    .line 82
    .line 83
    invoke-static {v12, v10, v13}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    invoke-static {v10, v12, v13}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    if-nez v4, :cond_3

    .line 94
    .line 95
    invoke-static {v12, v10, v15}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-static {v10, v12, v14}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    if-nez v4, :cond_5

    .line 106
    .line 107
    invoke-static {v12, v10, v14}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    invoke-static {v10, v12, v15}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    goto :goto_2

    .line 117
    :cond_6
    if-nez v4, :cond_7

    .line 118
    .line 119
    invoke-static {v12, v10, v13}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    goto :goto_2

    .line 124
    :cond_7
    invoke-static {v10, v12, v13}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    :goto_2
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move v9, v11

    .line 132
    const/4 v6, 0x1

    .line 133
    goto :goto_1

    .line 134
    :cond_8
    invoke-static {}, La/q3d;->p()V

    .line 135
    .line 136
    .line 137
    const/4 v0, 0x0

    .line 138
    throw v0

    .line 139
    :cond_9
    new-instance v11, La/vls;

    .line 140
    .line 141
    const/4 v2, 0x3

    .line 142
    invoke-direct {v11, v2}, La/vls;-><init>(B)V

    .line 143
    .line 144
    .line 145
    const/16 v12, 0x1e

    .line 146
    .line 147
    const-string v8, ", "

    .line 148
    .line 149
    const/4 v9, 0x0

    .line 150
    const/4 v10, 0x0

    .line 151
    invoke-static/range {v7 .. v12}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    iget-wide v3, v0, La/d0t;->v:J

    .line 156
    .line 157
    const-wide/16 v6, 0x4

    .line 158
    .line 159
    cmp-long v6, v3, v6

    .line 160
    .line 161
    const-string v7, ""

    .line 162
    .line 163
    if-nez v6, :cond_11

    .line 164
    .line 165
    if-eqz p2, :cond_a

    .line 166
    .line 167
    invoke-static {}, La/cy7;->c()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_a

    .line 172
    .line 173
    const/4 v6, 0x1

    .line 174
    goto :goto_3

    .line 175
    :cond_a
    move v6, v5

    .line 176
    :goto_3
    iget-object v0, v0, La/d0t;->p:La/rqs;

    .line 177
    .line 178
    iget-object v0, v0, La/rqs;->h:La/kts;

    .line 179
    .line 180
    iget-object v3, v0, La/kts;->a:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v4, v0, La/kts;->b:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-nez v8, :cond_b

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_b
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-nez v8, :cond_c

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_c
    new-instance v7, Landroid/text/SpannableString;

    .line 199
    .line 200
    invoke-direct {v7, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    iget-boolean v3, v0, La/kts;->c:Z

    .line 204
    .line 205
    const/16 v8, 0x11

    .line 206
    .line 207
    if-eqz v3, :cond_d

    .line 208
    .line 209
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 210
    .line 211
    invoke-direct {v3, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    invoke-virtual {v7, v3, v5, v9, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 219
    .line 220
    .line 221
    :cond_d
    new-instance v3, Landroid/text/SpannableString;

    .line 222
    .line 223
    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 224
    .line 225
    .line 226
    iget-boolean v0, v0, La/kts;->d:Z

    .line 227
    .line 228
    if-eqz v0, :cond_e

    .line 229
    .line 230
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 231
    .line 232
    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    invoke-virtual {v3, v0, v5, v1, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 240
    .line 241
    .line 242
    :cond_e
    if-eqz v6, :cond_f

    .line 243
    .line 244
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 245
    .line 246
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0, v13}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_f
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 266
    .line 267
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v0, v13}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    :goto_4
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 286
    .line 287
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    const-string v1, ":"

    .line 291
    .line 292
    if-eqz v6, :cond_10

    .line 293
    .line 294
    invoke-virtual {v0, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 301
    .line 302
    .line 303
    return-object v0

    .line 304
    :cond_10
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 311
    .line 312
    .line 313
    return-object v0

    .line 314
    :cond_11
    const-wide/16 v0, 0x28

    .line 315
    .line 316
    cmp-long v0, v3, v0

    .line 317
    .line 318
    if-nez v0, :cond_12

    .line 319
    .line 320
    const-string v0, "\\*"

    .line 321
    .line 322
    invoke-static {v0, v2, v7}, La/twn;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    return-object v0

    .line 327
    :cond_12
    return-object v2
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iget-object v0, p2, La/xiv0;->a:La/uiv0;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, La/uiv0;->i(I)La/pfx;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget v2, p1, La/pfx;->b:I

    .line 12
    .line 13
    iget-object p1, p0, La/y78;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, La/gbl0;

    .line 16
    .line 17
    sget-object v0, La/gbl0;->c2:La/lme0;

    .line 18
    .line 19
    invoke-virtual {p1}, La/gbl0;->I0()La/z4r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, La/z4r;->e:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/16 v5, 0xd

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static/range {v0 .. v5}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, La/gbl0;->I0()La/z4r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 38
    .line 39
    invoke-virtual {p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getCardsContainer()Landroid/view/ViewGroup;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget p0, p0, La/y78;->b:I

    .line 44
    .line 45
    add-int v5, v2, p0

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/16 v8, 0xd

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-static/range {v3 .. v8}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 52
    .line 53
    .line 54
    return-object p2
.end method

.method public m(La/d0t;ZZZ)Ljava/lang/CharSequence;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/d0t;->y:La/pfs;

    .line 5
    .line 6
    iget-boolean v1, p1, La/d0t;->h:Z

    .line 7
    .line 8
    iget-object v2, p1, La/d0t;->p:La/rqs;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance p1, Landroid/text/SpannableString;

    .line 14
    .line 15
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/ctf0;

    .line 18
    .line 19
    new-array p2, v3, [Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 22
    .line 23
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const p3, 0x7f130920

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p3, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v4, v0, La/pfs;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    iget-object v0, v0, La/pfs;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object v0, p1, La/d0t;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v4, v2, La/rqs;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v4}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-lez v5, :cond_2

    .line 81
    .line 82
    invoke-static {v4, v0}, Lkotlin/text/c;->l(Ljava/lang/String;Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    const-string v4, " "

    .line 89
    .line 90
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-static {v1, p1}, La/y78;->e(Landroid/text/SpannableStringBuilder;La/d0t;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v1, p1, p2}, La/y78;->f(Landroid/text/SpannableStringBuilder;La/d0t;Z)V

    .line 101
    .line 102
    .line 103
    if-eqz p3, :cond_4

    .line 104
    .line 105
    iget-object p2, p1, La/d0t;->q:La/f0t;

    .line 106
    .line 107
    iget-wide p2, p2, La/f0t;->a:J

    .line 108
    .line 109
    const-wide/16 v4, 0x0

    .line 110
    .line 111
    cmp-long p2, p2, v4

    .line 112
    .line 113
    if-eqz p2, :cond_3

    .line 114
    .line 115
    iget-object p2, p1, La/d0t;->r:La/f0t;

    .line 116
    .line 117
    iget-wide p2, p2, La/f0t;->a:J

    .line 118
    .line 119
    cmp-long p2, p2, v4

    .line 120
    .line 121
    if-eqz p2, :cond_3

    .line 122
    .line 123
    iget p2, p0, La/y78;->b:I

    .line 124
    .line 125
    invoke-static {p1, p2, p4}, La/qzb;->G0(La/d0t;IZ)Ljava/lang/CharSequence;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    goto :goto_0

    .line 130
    :cond_3
    const-string p2, ""

    .line 131
    .line 132
    :goto_0
    invoke-virtual {p0, v1, p2}, La/y78;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-static {p1, v3}, La/qzb;->q0(La/d0t;Z)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    iget-object p3, v2, La/rqs;->d:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    if-nez p3, :cond_5

    .line 146
    .line 147
    iget-object p3, v2, La/rqs;->i:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-nez p2, :cond_5

    .line 154
    .line 155
    const-string p2, " ("

    .line 156
    .line 157
    invoke-virtual {v1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p1, p4}, La/y78;->k(La/d0t;Z)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {v1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 165
    .line 166
    .line 167
    const-string p2, ")"

    .line 168
    .line 169
    invoke-virtual {v1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 170
    .line 171
    .line 172
    :cond_5
    iget-boolean p2, p1, La/d0t;->C:Z

    .line 173
    .line 174
    if-eqz p2, :cond_6

    .line 175
    .line 176
    invoke-virtual {p0, v1, p1}, La/y78;->c(Landroid/text/SpannableStringBuilder;La/d0t;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_6
    invoke-virtual {p0, v1, p1}, La/y78;->g(Landroid/text/SpannableStringBuilder;La/d0t;)V

    .line 181
    .line 182
    .line 183
    :goto_1
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-lez p1, :cond_7

    .line 192
    .line 193
    invoke-static {p0}, La/ttm0;->J(Ljava/lang/CharSequence;)C

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    const/16 p2, 0x2c

    .line 198
    .line 199
    if-ne p1, p2, :cond_7

    .line 200
    .line 201
    new-instance p1, Landroid/text/SpannableStringBuilder;

    .line 202
    .line 203
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    add-int/lit8 p2, p2, -0x1

    .line 208
    .line 209
    invoke-interface {p0, v3, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-direct {p1, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    return-object p1

    .line 217
    :cond_7
    return-object p0
.end method

.method public o(La/d0t;ZZZ)Ljava/lang/CharSequence;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/d0t;->y:La/pfs;

    .line 5
    .line 6
    iget-boolean v1, p1, La/d0t;->h:Z

    .line 7
    .line 8
    iget-wide v2, p1, La/d0t;->v:J

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance p1, Landroid/text/SpannableString;

    .line 14
    .line 15
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/ctf0;

    .line 18
    .line 19
    new-array p2, v4, [Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 22
    .line 23
    invoke-static {p2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const p3, 0x7f130920

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p3, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 39
    .line 40
    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v5, v0, La/pfs;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-lez v5, :cond_1

    .line 50
    .line 51
    iget-object v0, v0, La/pfs;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-static {v1, p1}, La/y78;->e(Landroid/text/SpannableStringBuilder;La/d0t;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1, p1, p2}, La/y78;->f(Landroid/text/SpannableStringBuilder;La/d0t;Z)V

    .line 60
    .line 61
    .line 62
    const-wide/16 v5, 0x42

    .line 63
    .line 64
    const-string p2, ""

    .line 65
    .line 66
    if-eqz p3, :cond_5

    .line 67
    .line 68
    iget-object p3, p1, La/d0t;->q:La/f0t;

    .line 69
    .line 70
    iget-wide v7, p3, La/f0t;->a:J

    .line 71
    .line 72
    const-wide/16 v9, 0x0

    .line 73
    .line 74
    cmp-long p3, v7, v9

    .line 75
    .line 76
    if-eqz p3, :cond_3

    .line 77
    .line 78
    iget-object p3, p1, La/d0t;->r:La/f0t;

    .line 79
    .line 80
    iget-wide v7, p3, La/f0t;->a:J

    .line 81
    .line 82
    cmp-long p3, v7, v9

    .line 83
    .line 84
    if-eqz p3, :cond_3

    .line 85
    .line 86
    iget p3, p0, La/y78;->b:I

    .line 87
    .line 88
    cmp-long v0, v2, v5

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    invoke-static {p1, p4}, La/qzb;->a0(La/d0t;Z)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    if-nez p3, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-static {p1, p3, p4}, La/qzb;->G0(La/d0t;IZ)Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    :goto_0
    move-object p3, p2

    .line 105
    :cond_4
    :goto_1
    invoke-virtual {p0, v1, p3}, La/y78;->d(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    iget-object p3, p1, La/d0t;->p:La/rqs;

    .line 109
    .line 110
    iget-object v0, p3, La/rqs;->c:Ljava/lang/String;

    .line 111
    .line 112
    const-string v7, "-"

    .line 113
    .line 114
    const-string v8, " : "

    .line 115
    .line 116
    invoke-static {v0, v7, v8, v4}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    cmp-long v2, v2, v5

    .line 121
    .line 122
    if-nez v2, :cond_6

    .line 123
    .line 124
    invoke-static {p1, v4}, La/qzb;->a0(La/d0t;Z)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_6

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    move-object p2, v0

    .line 132
    :goto_2
    iget-object v0, p3, La/rqs;->d:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_7

    .line 139
    .line 140
    iget-object p3, p3, La/rqs;->i:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-nez p2, :cond_7

    .line 147
    .line 148
    const-string p2, " ("

    .line 149
    .line 150
    invoke-virtual {v1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1, p4}, La/y78;->k(La/d0t;Z)Ljava/lang/CharSequence;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-virtual {v1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 158
    .line 159
    .line 160
    const-string p2, ")"

    .line 161
    .line 162
    invoke-virtual {v1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 163
    .line 164
    .line 165
    :cond_7
    iget-boolean p2, p1, La/d0t;->C:Z

    .line 166
    .line 167
    if-eqz p2, :cond_8

    .line 168
    .line 169
    invoke-virtual {p0, v1, p1}, La/y78;->c(Landroid/text/SpannableStringBuilder;La/d0t;)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    invoke-virtual {p0, v1, p1}, La/y78;->g(Landroid/text/SpannableStringBuilder;La/d0t;)V

    .line 174
    .line 175
    .line 176
    :goto_3
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-lez p1, :cond_9

    .line 185
    .line 186
    invoke-static {p0}, La/ttm0;->J(Ljava/lang/CharSequence;)C

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    const/16 p2, 0x2c

    .line 191
    .line 192
    if-ne p1, p2, :cond_9

    .line 193
    .line 194
    new-instance p1, Landroid/text/SpannableStringBuilder;

    .line 195
    .line 196
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    add-int/lit8 p2, p2, -0x1

    .line 201
    .line 202
    invoke-interface {p0, v4, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-direct {p1, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 207
    .line 208
    .line 209
    return-object p1

    .line 210
    :cond_9
    return-object p0
.end method

.method public q()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/kil;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public r(ILa/j04;)V
    .locals 8

    .line 1
    :goto_0
    shr-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, La/y78;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [La/j04;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-wide v2, v1, La/j04;->g:J

    .line 15
    .line 16
    iget-wide v4, p2, La/j04;->g:J

    .line 17
    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    sub-long/2addr v4, v2

    .line 21
    invoke-static {v6, v7, v4, v5}, Lkotlin/jvm/internal/Intrinsics;->f(JJ)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    iput p1, v1, La/j04;->f:I

    .line 28
    .line 29
    iget-object v2, p0, La/y78;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, [La/j04;

    .line 32
    .line 33
    aput-object v1, v2, p1

    .line 34
    .line 35
    move p1, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, [La/j04;

    .line 40
    .line 41
    aput-object p2, p0, p1

    .line 42
    .line 43
    iput p1, p2, La/j04;->f:I

    .line 44
    .line 45
    return-void
.end method

.method public s(La/w7r;II)V
    .locals 1

    .line 1
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/udg0;

    .line 4
    .line 5
    new-instance v0, La/okn0;

    .line 6
    .line 7
    invoke-direct {v0, p1}, La/okn0;-><init>(La/w7r;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p2, p3}, La/udg0;->e(La/qpg0;II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public t(La/guj;)J
    .locals 7

    .line 1
    iget-object v0, p0, La/y78;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/fq80;

    .line 4
    .line 5
    iget-object v1, v0, La/fq80;->a:[B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-virtual {p1, v1, v2, v3, v2}, La/guj;->b([BIIZ)Z

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/fq80;->a:[B

    .line 13
    .line 14
    aget-byte v1, v1, v2

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-wide/high16 p0, -0x8000000000000000L

    .line 21
    .line 22
    return-wide p0

    .line 23
    :cond_0
    const/16 v4, 0x80

    .line 24
    .line 25
    move v5, v2

    .line 26
    :goto_0
    and-int v6, v1, v4

    .line 27
    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    shr-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    not-int v4, v4

    .line 36
    and-int/2addr v1, v4

    .line 37
    iget-object v4, v0, La/fq80;->a:[B

    .line 38
    .line 39
    invoke-virtual {p1, v4, v3, v5, v2}, La/guj;->b([BIIZ)Z

    .line 40
    .line 41
    .line 42
    :goto_1
    if-ge v2, v5, :cond_2

    .line 43
    .line 44
    shl-int/lit8 p1, v1, 0x8

    .line 45
    .line 46
    iget-object v1, v0, La/fq80;->a:[B

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    aget-byte v1, v1, v2

    .line 51
    .line 52
    and-int/lit16 v1, v1, 0xff

    .line 53
    .line 54
    add-int/2addr v1, p1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget p1, p0, La/y78;->b:I

    .line 57
    .line 58
    add-int/2addr v5, v3

    .line 59
    add-int/2addr v5, p1

    .line 60
    iput v5, p0, La/y78;->b:I

    .line 61
    .line 62
    int-to-long p0, v1

    .line 63
    return-wide p0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-byte v0, p0, La/y78;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sparse-switch v0, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :sswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v2, p0, La/y78;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La/t3x;

    .line 17
    .line 18
    iget v3, v2, La/t3x;->b:I

    .line 19
    .line 20
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    :goto_0
    if-ge v1, v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2, v1}, La/t3x;->a(I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v4}, La/vtt0;->X(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "UnsupportedBrands{major="

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget p0, p0, La/y78;->b:I

    .line 47
    .line 48
    invoke-static {p0}, La/vtt0;->X(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ", compatible="

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, "}"

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :sswitch_1
    new-instance v0, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v2, p0, La/y78;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, [C

    .line 78
    .line 79
    iget p0, p0, La/y78;->b:I

    .line 80
    .line 81
    invoke-direct {v0, v2, v1, p0}, Ljava/lang/String;-><init>([CII)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public u()V
    .locals 4

    .line 1
    sget-object v0, La/jub;->c:La/jub;

    .line 2
    .line 3
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget v1, v0, La/jub;->b:I

    .line 15
    .line 16
    array-length v2, p0

    .line 17
    add-int/2addr v2, v1

    .line 18
    sget v3, La/jx3;->a:I

    .line 19
    .line 20
    if-ge v2, v3, :cond_0

    .line 21
    .line 22
    array-length v2, p0

    .line 23
    add-int/2addr v1, v2

    .line 24
    iput v1, v0, La/jub;->b:I

    .line 25
    .line 26
    iget-object v1, v0, La/jub;->a:La/xw3;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, La/xw3;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p0
.end method

.method public v(La/j04;)V
    .locals 9

    .line 1
    iget v0, p1, La/j04;->f:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_6

    .line 5
    .line 6
    iget v2, p0, La/y78;->b:I

    .line 7
    .line 8
    iget-object v3, p0, La/y78;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, [La/j04;

    .line 11
    .line 12
    aget-object v3, v3, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput v1, p1, La/j04;->f:I

    .line 18
    .line 19
    iget-object v1, p0, La/y78;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, [La/j04;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object v4, v1, v2

    .line 25
    .line 26
    add-int/lit8 v2, v2, -0x1

    .line 27
    .line 28
    iput v2, p0, La/y78;->b:I

    .line 29
    .line 30
    if-ne p1, v3, :cond_0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-wide v1, p1, La/j04;->g:J

    .line 34
    .line 35
    iget-wide v4, v3, La/j04;->g:J

    .line 36
    .line 37
    sub-long/2addr v4, v1

    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    invoke-static {v1, v2, v4, v5}, Lkotlin/jvm/internal/Intrinsics;->f(JJ)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, [La/j04;

    .line 49
    .line 50
    aput-object v3, p0, v0

    .line 51
    .line 52
    iput v0, v3, La/j04;->f:I

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    if-gez p1, :cond_5

    .line 56
    .line 57
    :goto_0
    shl-int/lit8 p1, v0, 0x1

    .line 58
    .line 59
    add-int/lit8 v4, p1, 0x1

    .line 60
    .line 61
    iget v5, p0, La/y78;->b:I

    .line 62
    .line 63
    if-gt v4, v5, :cond_3

    .line 64
    .line 65
    iget-object v5, p0, La/y78;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v5, [La/j04;

    .line 68
    .line 69
    aget-object p1, v5, p1

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v5, p0, La/y78;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, [La/j04;

    .line 77
    .line 78
    aget-object v4, v5, v4

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-wide v5, p1, La/j04;->g:J

    .line 84
    .line 85
    iget-wide v7, v4, La/j04;->g:J

    .line 86
    .line 87
    sub-long/2addr v7, v5

    .line 88
    invoke-static {v1, v2, v7, v8}, Lkotlin/jvm/internal/Intrinsics;->f(JJ)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-gez v5, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move-object p1, v4

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    if-gt p1, v5, :cond_4

    .line 98
    .line 99
    iget-object v4, p0, La/y78;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, [La/j04;

    .line 102
    .line 103
    aget-object p1, v4, p1

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    :goto_1
    iget-wide v4, v3, La/j04;->g:J

    .line 109
    .line 110
    iget-wide v6, p1, La/j04;->g:J

    .line 111
    .line 112
    sub-long/2addr v6, v4

    .line 113
    invoke-static {v1, v2, v6, v7}, Lkotlin/jvm/internal/Intrinsics;->f(JJ)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-lez v4, :cond_4

    .line 118
    .line 119
    iget v4, p1, La/j04;->f:I

    .line 120
    .line 121
    iput v0, p1, La/j04;->f:I

    .line 122
    .line 123
    iget-object v5, p0, La/y78;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v5, [La/j04;

    .line 126
    .line 127
    aput-object p1, v5, v0

    .line 128
    .line 129
    move v0, v4

    .line 130
    goto :goto_0

    .line 131
    :cond_4
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, [La/j04;

    .line 134
    .line 135
    aput-object v3, p0, v0

    .line 136
    .line 137
    iput v0, v3, La/j04;->f:I

    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    invoke-virtual {p0, v0, v3}, La/y78;->r(ILa/j04;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_6
    const-string p0, "Failed requirement."

    .line 145
    .line 146
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public w(La/jr30;La/dyw;Ljava/util/Map;J)V
    .locals 5

    .line 1
    iget-object v0, p0, La/y78;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    check-cast v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance p1, La/rbe0;

    .line 22
    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0, p3, p4, p5}, La/rbe0;-><init>(Ljava/lang/ref/WeakReference;Ljava/util/Map;J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    const/4 v0, 0x0

    .line 46
    :goto_0
    if-ge v0, p3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, La/rbe0;

    .line 53
    .line 54
    iget-wide v3, v2, La/rbe0;->c:J

    .line 55
    .line 56
    cmp-long v3, p4, v3

    .line 57
    .line 58
    if-ltz v3, :cond_3

    .line 59
    .line 60
    iget-object p3, v2, La/rbe0;->a:Ljava/lang/ref/WeakReference;

    .line 61
    .line 62
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, p2, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    :goto_1
    invoke-virtual {p0}, La/y78;->h()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v1, p0, La/y78;->b:I

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, La/y78;->j(II)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, La/y78;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [C

    .line 19
    .line 20
    iget v2, p0, La/y78;->b:I

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {p1, v3, v4, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 28
    .line 29
    .line 30
    iget p1, p0, La/y78;->b:I

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    iput p1, p0, La/y78;->b:I

    .line 34
    .line 35
    return-void
.end method

.method public zza()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/y78;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, La/y78;->b:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, La/y78;->b:I

    .line 10
    .line 11
    return p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method
