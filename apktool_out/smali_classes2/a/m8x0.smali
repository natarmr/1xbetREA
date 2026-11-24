.class public final synthetic La/m8x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c7x0;
.implements La/d5x0;


# direct methods
.method public constructor <init>(La/xow0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(La/atm0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/h8x0;

    .line 2
    .line 3
    new-instance p0, La/acw0;

    .line 4
    .line 5
    invoke-direct {p0, p1}, La/acw0;-><init>(La/h8x0;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public c(La/vkr0;)La/atm0;
    .locals 4

    .line 1
    iget-object p0, p1, La/vkr0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/String;

    .line 4
    .line 5
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    :try_start_0
    iget-object p0, p1, La/vkr0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/sjw0;

    .line 17
    .line 18
    sget-object v1, La/dkw0;->b:La/dkw0;

    .line 19
    .line 20
    invoke-static {p0, v1}, La/x9x0;->u(La/sjw0;La/dkw0;)La/x9x0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, La/x9x0;->t()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-static {}, La/g8x0;->b()La/x4w0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0}, La/x9x0;->z()La/sjw0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, La/sjw0;->e()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, La/x4w0;->f(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/x9x0;->y()La/dax0;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, La/dax0;->t()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {v1, v2}, La/x4w0;->g(I)V

    .line 54
    .line 55
    .line 56
    iget-object v2, p1, La/vkr0;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, La/lpw0;

    .line 59
    .line 60
    invoke-static {v2}, La/c9x0;->a(La/lpw0;)La/hbb;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput-object v2, v1, La/x4w0;->c:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v1}, La/x4w0;->e()La/g8x0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v2, La/mkt0;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, v2, La/mkt0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v0, v2, La/mkt0;->c:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v1, v2, La/mkt0;->a:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {p0}, La/x9x0;->z()La/sjw0;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, La/sjw0;->r()[B

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    new-instance v1, La/rkt0;

    .line 90
    .line 91
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const/16 v3, 0xb

    .line 96
    .line 97
    invoke-direct {v1, p0, v3}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    iput-object v1, v2, La/mkt0;->b:Ljava/lang/Object;

    .line 101
    .line 102
    iget-object p0, p1, La/vkr0;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Ljava/lang/Integer;

    .line 105
    .line 106
    iput-object p0, v2, La/mkt0;->c:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-virtual {v2}, La/mkt0;->d()La/v7x0;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 114
    .line 115
    const-string p1, "Only version 0 keys are accepted"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0
    :try_end_0
    .catch La/qkw0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :catch_0
    const-string p0, "Parsing AesCmacKey failed"

    .line 122
    .line 123
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_1
    const-string p0, "Wrong type URL in call to AesCmacProtoSerialization.parseKey"

    .line 128
    .line 129
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v0
.end method
