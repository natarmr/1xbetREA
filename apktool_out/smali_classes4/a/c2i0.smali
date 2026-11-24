.class public final synthetic La/c2i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f2i0;


# direct methods
.method public synthetic constructor <init>(La/f2i0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c2i0;->a:B

    iput-object p1, p0, La/c2i0;->b:La/f2i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-byte p1, p0, La/c2i0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/c2i0;->b:La/f2i0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/f2i0;->q2:La/eke0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p1, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, La/f2i0;->k2:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v3, v3, La/g2i0;->b:Landroid/widget/NumberPicker;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/widget/NumberPicker;->getValue()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Date;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/f2i0;->a1()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v2, v2, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/widget/NumberPicker;->getValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const/16 v3, 0xb

    .line 71
    .line 72
    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-object v2, v2, La/g2i0;->f:Landroid/widget/NumberPicker;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/widget/NumberPicker;->getValue()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iget-object v3, p0, La/f2i0;->m2:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {v2, v3}, La/dqm0;->r(ILjava/util/ArrayList;)La/vhq0;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-boolean v2, v2, La/vhq0;->b:Z

    .line 93
    .line 94
    const/16 v3, 0x9

    .line 95
    .line 96
    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v2, v2, La/g2i0;->c:Landroid/widget/NumberPicker;

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/widget/NumberPicker;->getValue()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    const/16 v3, 0xa

    .line 110
    .line 111
    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    .line 112
    .line 113
    .line 114
    :goto_0
    iget-object v2, p0, La/f2i0;->n2:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {p0}, La/f2i0;->W0()La/g2i0;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iget-object v3, v3, La/g2i0;->d:Landroid/widget/NumberPicker;

    .line 121
    .line 122
    invoke-virtual {v3}, Landroid/widget/NumberPicker;->getValue()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    const/16 v3, 0xc

    .line 137
    .line 138
    invoke-virtual {v1, v3, v2}, Ljava/util/Calendar;->set(II)V

    .line 139
    .line 140
    .line 141
    const/16 v2, 0xd

    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 145
    .line 146
    .line 147
    const/16 v2, 0xe

    .line 148
    .line 149
    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->set(II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    new-instance v2, Lkotlin/Pair;

    .line 157
    .line 158
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v0, La/wss;

    .line 177
    .line 178
    const/16 v1, 0x1d

    .line 179
    .line 180
    invoke-direct {v0, p0, v1}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 181
    .line 182
    .line 183
    const-wide/16 v1, 0x55

    .line 184
    .line 185
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_0
    sget-object p1, La/f2i0;->q2:La/eke0;

    .line 190
    .line 191
    invoke-virtual {p0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iget-object p1, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->d:La/j2i0;

    .line 196
    .line 197
    sget-object v0, La/j2i0;->b:La/j2i0;

    .line 198
    .line 199
    if-ne p1, v0, :cond_1

    .line 200
    .line 201
    invoke-virtual {p0}, La/f2i0;->Z0()Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    iget-object p1, p1, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectDateTimeScreenParams;->e:Ljava/lang/String;

    .line 206
    .line 207
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_1
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
