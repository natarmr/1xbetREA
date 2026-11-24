.class public abstract Lcom/huawei/agconnect/config/impl/Hex;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/agconnect/config/impl/Hex;->a:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    and-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    array-length v0, p0

    .line 12
    shr-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    new-array v0, v0, [B

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    array-length v4, p0

    .line 19
    if-ge v2, v4, :cond_2

    .line 20
    .line 21
    aget-char v4, p0, v2

    .line 22
    .line 23
    const/16 v5, 0x10

    .line 24
    .line 25
    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const-string v6, "Illegal hexadecimal character at index "

    .line 30
    .line 31
    const/4 v7, -0x1

    .line 32
    if-eq v4, v7, :cond_1

    .line 33
    .line 34
    add-int/lit8 v8, v2, 0x1

    .line 35
    .line 36
    aget-char v9, p0, v8

    .line 37
    .line 38
    invoke-static {v9, v5}, Ljava/lang/Character;->digit(CI)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eq v5, v7, :cond_0

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x2

    .line 45
    .line 46
    shl-int/lit8 v4, v4, 0x4

    .line 47
    .line 48
    or-int/2addr v4, v5

    .line 49
    and-int/lit16 v4, v4, 0xff

    .line 50
    .line 51
    int-to-byte v4, v4

    .line 52
    aput-byte v4, v0, v3

    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {v8, v6}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :goto_1
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    invoke-static {v2, v6}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    return-object v0

    .line 71
    :cond_3
    const-string p0, "Odd number of characters."

    .line 72
    .line 73
    goto :goto_1
.end method

.method public static b([B)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-byte v3, p0, v2

    shr-int/lit8 v4, v3, 0x4

    and-int/lit8 v4, v4, 0xf

    sget-object v5, Lcom/huawei/agconnect/config/impl/Hex;->a:[C

    aget-char v4, v5, v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v5, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
