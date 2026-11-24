.class public final synthetic La/ybt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ybt0;->a:B

    iput-object p1, p0, La/ybt0;->b:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ybt0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, La/ybt0;->b:La/l7m0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/b8v0;

    .line 17
    .line 18
    iget-object p0, p0, La/b8v0;->b:La/y7v0;

    .line 19
    .line 20
    iget-object p0, p0, La/y7v0;->b:La/a4x;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/b8v0;

    .line 28
    .line 29
    iget-object p0, p0, La/b8v0;->b:La/y7v0;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, La/ytu0;

    .line 37
    .line 38
    iget-object p0, p0, La/ytu0;->b:La/rtu0;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_2
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/ytu0;

    .line 46
    .line 47
    iget-object p0, p0, La/ytu0;->a:La/imm;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/hru0;

    .line 55
    .line 56
    iget-object p0, p0, La/hru0;->c:La/a4x;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_4
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/hru0;

    .line 64
    .line 65
    iget-object p0, p0, La/hru0;->b:La/bru0;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_5
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/hru0;

    .line 73
    .line 74
    iget-object p0, p0, La/hru0;->a:La/gru0;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_6
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, La/hru0;

    .line 82
    .line 83
    iget-boolean p0, p0, La/hru0;->d:Z

    .line 84
    .line 85
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_7
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    cmpg-float p0, p0, v2

    .line 101
    .line 102
    if-nez p0, :cond_0

    .line 103
    .line 104
    move v1, v3

    .line 105
    :cond_0
    xor-int/lit8 p0, v1, 0x1

    .line 106
    .line 107
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_8
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/mou0;

    .line 117
    .line 118
    iget-object p0, p0, La/mou0;->c:La/a4x;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_9
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, La/mou0;

    .line 126
    .line 127
    iget-object p0, p0, La/mou0;->b:La/gou0;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_a
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, La/mou0;

    .line 135
    .line 136
    iget-object p0, p0, La/mou0;->a:La/lou0;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_b
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, La/mou0;

    .line 144
    .line 145
    iget-boolean p0, p0, La/mou0;->d:Z

    .line 146
    .line 147
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :pswitch_c
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Ljava/lang/CharSequence;

    .line 157
    .line 158
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_1

    .line 163
    .line 164
    const/4 v3, 0x2

    .line 165
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_d
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    cmpg-float p0, p0, v2

    .line 181
    .line 182
    if-nez p0, :cond_2

    .line 183
    .line 184
    move v1, v3

    .line 185
    :cond_2
    xor-int/lit8 p0, v1, 0x1

    .line 186
    .line 187
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :pswitch_e
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, La/fdt0;

    .line 197
    .line 198
    iget-object p0, p0, La/fdt0;->b:La/act0;

    .line 199
    .line 200
    iget-boolean p0, p0, La/act0;->c:Z

    .line 201
    .line 202
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    return-object p0

    .line 207
    :pswitch_f
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    check-cast p0, La/fdt0;

    .line 212
    .line 213
    iget-object p0, p0, La/fdt0;->b:La/act0;

    .line 214
    .line 215
    iget-object p0, p0, La/act0;->b:La/a4x;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_10
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    check-cast p0, La/fdt0;

    .line 223
    .line 224
    iget-object p0, p0, La/fdt0;->b:La/act0;

    .line 225
    .line 226
    iget-object p0, p0, La/act0;->a:La/d9t0;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
