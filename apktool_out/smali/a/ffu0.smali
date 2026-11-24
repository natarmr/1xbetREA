.class public final synthetic La/ffu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fck0;


# direct methods
.method public synthetic constructor <init>(La/fck0;IJ)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput-byte p2, p0, La/ffu0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ffu0;->b:La/fck0;

    return-void
.end method

.method public synthetic constructor <init>(La/fck0;JI)V
    .locals 0

    .line 2
    const/4 p2, 0x3

    iput-byte p2, p0, La/ffu0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ffu0;->b:La/fck0;

    return-void
.end method

.method public synthetic constructor <init>(La/fck0;Landroidx/media3/common/b;La/alj;)V
    .locals 0

    .line 3
    const/4 p2, 0x6

    iput-byte p2, p0, La/ffu0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ffu0;->b:La/fck0;

    return-void
.end method

.method public synthetic constructor <init>(La/fck0;Ljava/lang/Object;B)V
    .locals 0

    .line 4
    iput-byte p3, p0, La/ffu0;->a:B

    iput-object p1, p0, La/ffu0;->b:La/fck0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/fck0;Ljava/lang/String;JJ)V
    .locals 0

    .line 5
    const/4 p2, 0x0

    iput-byte p2, p0, La/ffu0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ffu0;->b:La/fck0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/ffu0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ffu0;->b:La/fck0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/qlo;

    .line 11
    .line 12
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 15
    .line 16
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 17
    .line 18
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, La/csj;

    .line 23
    .line 24
    const/4 v2, 0x5

    .line 25
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 26
    .line 27
    .line 28
    const/16 v2, 0x3f9

    .line 29
    .line 30
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, La/qlo;

    .line 37
    .line 38
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 41
    .line 42
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 43
    .line 44
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, La/csj;

    .line 49
    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 53
    .line 54
    .line 55
    const/16 v2, 0x3f7

    .line 56
    .line 57
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_1
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/qlo;

    .line 64
    .line 65
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 66
    .line 67
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 68
    .line 69
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 70
    .line 71
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v1, La/t9f;

    .line 76
    .line 77
    const/16 v2, 0x1b

    .line 78
    .line 79
    invoke-direct {v1, v2}, La/t9f;-><init>(B)V

    .line 80
    .line 81
    .line 82
    const/16 v2, 0x406

    .line 83
    .line 84
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_2
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, La/qlo;

    .line 91
    .line 92
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 93
    .line 94
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 95
    .line 96
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 97
    .line 98
    iget-object v0, p0, La/fsj;->d:La/uii;

    .line 99
    .line 100
    iget-object v0, v0, La/uii;->e:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, La/vn30;

    .line 103
    .line 104
    invoke-virtual {p0, v0}, La/fsj;->J(La/vn30;)La/ft2;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v1, La/csj;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 112
    .line 113
    .line 114
    const/16 v2, 0x3fd

    .line 115
    .line 116
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_3
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, La/qlo;

    .line 123
    .line 124
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 125
    .line 126
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 127
    .line 128
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 129
    .line 130
    iget-object v0, p0, La/fsj;->d:La/uii;

    .line 131
    .line 132
    iget-object v0, v0, La/uii;->e:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, La/vn30;

    .line 135
    .line 136
    invoke-virtual {p0, v0}, La/fsj;->J(La/vn30;)La/ft2;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    new-instance v1, La/t9f;

    .line 141
    .line 142
    const/16 v2, 0x1d

    .line 143
    .line 144
    invoke-direct {v1, v2}, La/t9f;-><init>(B)V

    .line 145
    .line 146
    .line 147
    const/16 v2, 0x3fa

    .line 148
    .line 149
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_4
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, La/qlo;

    .line 156
    .line 157
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 158
    .line 159
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 160
    .line 161
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 162
    .line 163
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v1, La/t9f;

    .line 168
    .line 169
    const/16 v2, 0x1c

    .line 170
    .line 171
    invoke-direct {v1, v2}, La/t9f;-><init>(B)V

    .line 172
    .line 173
    .line 174
    const/16 v2, 0x3fb

    .line 175
    .line 176
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_5
    iget-object p0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, La/qlo;

    .line 183
    .line 184
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 185
    .line 186
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 187
    .line 188
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 189
    .line 190
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v1, La/csj;

    .line 195
    .line 196
    const/16 v2, 0xa

    .line 197
    .line 198
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 199
    .line 200
    .line 201
    const/16 v2, 0x3f8

    .line 202
    .line 203
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
