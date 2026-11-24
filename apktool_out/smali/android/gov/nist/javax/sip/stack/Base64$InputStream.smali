.class public Landroid/gov/nist/javax/sip/stack/Base64$InputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/Base64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InputStream"
.end annotation


# instance fields
.field private breakLines:Z

.field private buffer:[B

.field private bufferLength:I

.field private decodabet:[B

.field private encode:Z

.field private lineLength:I

.field private numSigBytes:I

.field private options:I

.field private position:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->options:I

    .line 5
    .line 6
    and-int/lit8 p1, p2, 0x8

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez p1, :cond_0

    .line 11
    .line 12
    move p1, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v0

    .line 15
    :goto_0
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->breakLines:Z

    .line 16
    .line 17
    and-int/lit8 p1, p2, 0x1

    .line 18
    .line 19
    if-lez p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v1, v0

    .line 23
    :goto_1
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->encode:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x4

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/4 p1, 0x3

    .line 30
    :goto_2
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->bufferLength:I

    .line 31
    .line 32
    new-array p1, p1, [B

    .line 33
    .line 34
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->buffer:[B

    .line 35
    .line 36
    const/4 p1, -0x1

    .line 37
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->position:I

    .line 38
    .line 39
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->lineLength:I

    .line 40
    .line 41
    invoke-static {p2}, Landroid/gov/nist/javax/sip/stack/Base64;->access$000(I)[B

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->decodabet:[B

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public read()I
    .locals 10

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->position:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-gez v0, :cond_9

    .line 6
    .line 7
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->encode:Z

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    new-array v4, v0, [B

    .line 14
    .line 15
    move v5, v2

    .line 16
    move v6, v5

    .line 17
    :goto_0
    if-ge v5, v0, :cond_0

    .line 18
    .line 19
    iget-object v7, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 20
    .line 21
    invoke-virtual {v7}, Ljava/io/InputStream;->read()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-ltz v7, :cond_0

    .line 26
    .line 27
    int-to-byte v7, v7

    .line 28
    aput-byte v7, v4, v5

    .line 29
    .line 30
    add-int/lit8 v6, v6, 0x1

    .line 31
    .line 32
    add-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-lez v6, :cond_1

    .line 36
    .line 37
    iget-object v7, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->buffer:[B

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    iget v9, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->options:I

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-static/range {v4 .. v9}, Landroid/gov/nist/javax/sip/stack/Base64;->access$100([BII[BII)[B

    .line 44
    .line 45
    .line 46
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->position:I

    .line 47
    .line 48
    iput v3, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->numSigBytes:I

    .line 49
    .line 50
    :goto_1
    move v0, v2

    .line 51
    goto :goto_4

    .line 52
    :cond_1
    return v1

    .line 53
    :cond_2
    new-array v0, v3, [B

    .line 54
    .line 55
    move v4, v2

    .line 56
    :goto_2
    if-ge v4, v3, :cond_6

    .line 57
    .line 58
    :cond_3
    iget-object v5, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/io/InputStream;->read()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-ltz v5, :cond_4

    .line 65
    .line 66
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->decodabet:[B

    .line 67
    .line 68
    and-int/lit8 v7, v5, 0x7f

    .line 69
    .line 70
    aget-byte v6, v6, v7

    .line 71
    .line 72
    const/4 v7, -0x5

    .line 73
    if-le v6, v7, :cond_3

    .line 74
    .line 75
    :cond_4
    if-gez v5, :cond_5

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    int-to-byte v5, v5

    .line 79
    aput-byte v5, v0, v4

    .line 80
    .line 81
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    :goto_3
    if-ne v4, v3, :cond_7

    .line 85
    .line 86
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->buffer:[B

    .line 87
    .line 88
    iget v4, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->options:I

    .line 89
    .line 90
    invoke-static {v0, v2, v3, v2, v4}, Landroid/gov/nist/javax/sip/stack/Base64;->access$200([BI[BII)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->numSigBytes:I

    .line 95
    .line 96
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->position:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_7
    if-nez v4, :cond_8

    .line 100
    .line 101
    return v1

    .line 102
    :cond_8
    const-string p0, "Improperly padded Base64 input."

    .line 103
    .line 104
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 p0, 0x0

    .line 108
    return p0

    .line 109
    :cond_9
    :goto_4
    if-ltz v0, :cond_d

    .line 110
    .line 111
    iget v3, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->numSigBytes:I

    .line 112
    .line 113
    if-lt v0, v3, :cond_a

    .line 114
    .line 115
    return v1

    .line 116
    :cond_a
    iget-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->encode:Z

    .line 117
    .line 118
    if-eqz v3, :cond_b

    .line 119
    .line 120
    iget-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->breakLines:Z

    .line 121
    .line 122
    if-eqz v3, :cond_b

    .line 123
    .line 124
    iget v3, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->lineLength:I

    .line 125
    .line 126
    const/16 v4, 0x4c

    .line 127
    .line 128
    if-lt v3, v4, :cond_b

    .line 129
    .line 130
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->lineLength:I

    .line 131
    .line 132
    const/16 p0, 0xa

    .line 133
    .line 134
    return p0

    .line 135
    :cond_b
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->lineLength:I

    .line 136
    .line 137
    add-int/lit8 v2, v2, 0x1

    .line 138
    .line 139
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->lineLength:I

    .line 140
    .line 141
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->buffer:[B

    .line 142
    .line 143
    add-int/lit8 v3, v0, 0x1

    .line 144
    .line 145
    iput v3, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->position:I

    .line 146
    .line 147
    aget-byte v0, v2, v0

    .line 148
    .line 149
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->bufferLength:I

    .line 150
    .line 151
    if-lt v3, v2, :cond_c

    .line 152
    .line 153
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->position:I

    .line 154
    .line 155
    :cond_c
    and-int/lit16 p0, v0, 0xff

    .line 156
    .line 157
    return p0

    .line 158
    :cond_d
    const-string p0, "Error in Base64 code reading stream."

    .line 159
    .line 160
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    return p0
.end method

.method public read([BII)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    .line 165
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/Base64$InputStream;->read()I

    move-result v1

    if-ltz v1, :cond_0

    add-int v2, p2, v0

    int-to-byte v1, v1

    .line 166
    aput-byte v1, p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    return v0
.end method
