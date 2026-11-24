.class public final synthetic La/c8x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c7x0;
.implements La/a7x0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/c8x0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/atm0;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/v7x0;

    .line 2
    .line 3
    iget-object p0, p1, La/v7x0;->a:La/g8x0;

    .line 4
    .line 5
    iget p0, p0, La/g8x0;->a:I

    .line 6
    .line 7
    const/16 v0, 0x20

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    new-instance p0, La/acw0;

    .line 12
    .line 13
    invoke-direct {p0, p1}, La/acw0;-><init>(La/v7x0;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "AesCmacKey size wrong, must be 32 bytes"

    .line 18
    .line 19
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public h(La/fpw0;)La/x4w0;
    .locals 4

    .line 1
    iget-byte p0, p0, La/c8x0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/p8x0;

    .line 7
    .line 8
    iget-object p0, p1, La/p8x0;->c:La/arw0;

    .line 9
    .line 10
    invoke-static {p0}, La/g9x0;->a(La/arw0;)La/lpw0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, La/qdx0;->y()La/odx0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {}, La/wdx0;->x()La/udx0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget v2, p1, La/p8x0;->b:I

    .line 23
    .line 24
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 25
    .line 26
    .line 27
    iget-object v3, v1, La/hkw0;->b:La/jkw0;

    .line 28
    .line 29
    check-cast v3, La/wdx0;

    .line 30
    .line 31
    invoke-static {v3, v2}, La/wdx0;->u(La/wdx0;I)V

    .line 32
    .line 33
    .line 34
    sget-object v2, La/g9x0;->a:La/okt0;

    .line 35
    .line 36
    iget-object v3, p1, La/p8x0;->d:La/o8x0;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La/mdx0;

    .line 43
    .line 44
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 45
    .line 46
    .line 47
    iget-object v3, v1, La/hkw0;->b:La/jkw0;

    .line 48
    .line 49
    check-cast v3, La/wdx0;

    .line 50
    .line 51
    invoke-static {v3, v2}, La/wdx0;->v(La/wdx0;La/mdx0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, La/wdx0;

    .line 59
    .line 60
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 64
    .line 65
    check-cast v2, La/qdx0;

    .line 66
    .line 67
    invoke-static {v2, v1}, La/qdx0;->w(La/qdx0;La/wdx0;)V

    .line 68
    .line 69
    .line 70
    iget p1, p1, La/p8x0;->a:I

    .line 71
    .line 72
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 73
    .line 74
    .line 75
    iget-object v1, v0, La/hkw0;->b:La/jkw0;

    .line 76
    .line 77
    check-cast v1, La/qdx0;

    .line 78
    .line 79
    invoke-static {v1, p1}, La/qdx0;->v(La/qdx0;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/qdx0;

    .line 87
    .line 88
    invoke-virtual {p1}, La/ojw0;->a()La/vjw0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 93
    .line 94
    invoke-static {v0, p0, p1}, La/x4w0;->d(Ljava/lang/String;La/lpw0;La/sjw0;)La/x4w0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_0
    check-cast p1, La/g8x0;

    .line 100
    .line 101
    iget-object p0, p1, La/g8x0;->c:La/hbb;

    .line 102
    .line 103
    invoke-static {p0}, La/c9x0;->b(La/hbb;)La/lpw0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {}, La/aax0;->x()La/z9x0;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {}, La/dax0;->v()La/cax0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget v2, p1, La/g8x0;->b:I

    .line 116
    .line 117
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 118
    .line 119
    .line 120
    iget-object v3, v1, La/hkw0;->b:La/jkw0;

    .line 121
    .line 122
    check-cast v3, La/dax0;

    .line 123
    .line 124
    invoke-static {v3, v2}, La/dax0;->u(La/dax0;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, La/dax0;

    .line 132
    .line 133
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 134
    .line 135
    .line 136
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 137
    .line 138
    check-cast v2, La/aax0;

    .line 139
    .line 140
    invoke-static {v2, v1}, La/aax0;->w(La/aax0;La/dax0;)V

    .line 141
    .line 142
    .line 143
    iget p1, p1, La/g8x0;->a:I

    .line 144
    .line 145
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 146
    .line 147
    .line 148
    iget-object v1, v0, La/hkw0;->b:La/jkw0;

    .line 149
    .line 150
    check-cast v1, La/aax0;

    .line 151
    .line 152
    invoke-static {v1, p1}, La/aax0;->v(La/aax0;I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, La/aax0;

    .line 160
    .line 161
    invoke-virtual {p1}, La/ojw0;->a()La/vjw0;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 166
    .line 167
    invoke-static {v0, p0, p1}, La/x4w0;->d(Ljava/lang/String;La/lpw0;La/sjw0;)La/x4w0;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
