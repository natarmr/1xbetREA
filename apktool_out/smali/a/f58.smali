.class public final synthetic La/f58;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/vx9;La/ux9;La/gnf0;I)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput-byte p2, p0, La/f58;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/f58;->c:Ljava/lang/Object;

    iput-object p3, p0, La/f58;->d:Ljava/lang/Object;

    iput p4, p0, La/f58;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/f58;->a:B

    iput-object p1, p0, La/f58;->c:Ljava/lang/Object;

    iput p2, p0, La/f58;->b:I

    iput-object p3, p0, La/f58;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/f58;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/f58;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, La/f58;->b:I

    .line 7
    .line 8
    iget-object p0, p0, La/f58;->c:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    .line 15
    check-cast v2, La/sg00;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/ug00;

    .line 32
    .line 33
    iget-boolean v4, v0, La/ug00;->d:Z

    .line 34
    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    const/4 v4, -0x1

    .line 38
    if-eq v3, v4, :cond_1

    .line 39
    .line 40
    iget-object v4, v0, La/ug00;->b:La/s88;

    .line 41
    .line 42
    invoke-virtual {v4, v3}, La/s88;->b(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-boolean v1, v0, La/ug00;->c:Z

    .line 46
    .line 47
    iget-object v0, v0, La/ug00;->a:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {v2, v0}, La/sg00;->invoke(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-void

    .line 54
    :pswitch_0
    check-cast p0, Landroid/widget/HorizontalScrollView;

    .line 55
    .line 56
    check-cast v2, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 57
    .line 58
    sget v0, Lorg/xplatform/uikit/components/chips/DsChipGroup;->r:I

    .line 59
    .line 60
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p0, v3, v0}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 69
    .line 70
    check-cast v2, La/e7e;

    .line 71
    .line 72
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 73
    .line 74
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 75
    .line 76
    .line 77
    iget-object p0, v2, La/e7e;->S1:Landroid/os/Handler;

    .line 78
    .line 79
    iget-object v0, v2, La/e7e;->b2:Ljava/lang/Runnable;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, La/u6e;

    .line 85
    .line 86
    invoke-direct {p0, v2, v1}, La/u6e;-><init>(La/e7e;B)V

    .line 87
    .line 88
    .line 89
    iput-object p0, v2, La/e7e;->b2:Ljava/lang/Runnable;

    .line 90
    .line 91
    iget-object v0, v2, La/e7e;->S1:Landroid/os/Handler;

    .line 92
    .line 93
    const-wide/16 v1, 0x190

    .line 94
    .line 95
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_2
    check-cast p0, La/yfd;

    .line 100
    .line 101
    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    .line 102
    .line 103
    new-instance v0, Landroid/content/Intent;

    .line 104
    .line 105
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 115
    .line 116
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/4 v1, 0x0

    .line 121
    invoke-virtual {p0, v3, v1, v0}, La/yfd;->a(IILandroid/content/Intent;)Z

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_3
    check-cast p0, La/yfd;

    .line 126
    .line 127
    check-cast v2, La/r7v;

    .line 128
    .line 129
    iget-object v0, v2, La/r7v;->a:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ljava/io/Serializable;

    .line 132
    .line 133
    iget-object v1, p0, La/yfd;->a:Ljava/util/LinkedHashMap;

    .line 134
    .line 135
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Ljava/lang/String;

    .line 144
    .line 145
    if-nez v1, :cond_3

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    iget-object v2, p0, La/yfd;->e:Ljava/util/LinkedHashMap;

    .line 149
    .line 150
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, La/eo;

    .line 155
    .line 156
    if-eqz v2, :cond_4

    .line 157
    .line 158
    iget-object v3, v2, La/eo;->a:La/wn;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    const/4 v3, 0x0

    .line 162
    :goto_1
    if-nez v3, :cond_5

    .line 163
    .line 164
    iget-object v2, p0, La/yfd;->g:Landroid/os/Bundle;

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object p0, p0, La/yfd;->f:Ljava/util/LinkedHashMap;

    .line 170
    .line 171
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    iget-object v2, v2, La/eo;->a:La/wn;

    .line 176
    .line 177
    iget-object p0, p0, La/yfd;->d:Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-eqz p0, :cond_6

    .line 184
    .line 185
    invoke-interface {v2, v0}, La/wn;->a(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_6
    :goto_2
    return-void

    .line 189
    :pswitch_4
    check-cast p0, Landroid/widget/HorizontalScrollView;

    .line 190
    .line 191
    check-cast v2, Lorg/xplatform/uikit/components/chips/Chip;

    .line 192
    .line 193
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-virtual {p0, v3, v0}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_5
    check-cast p0, La/vx9;

    .line 202
    .line 203
    check-cast v2, La/gnf0;

    .line 204
    .line 205
    invoke-static {v2}, La/ux9;->g(La/gnf0;)I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {p0, v0, v3}, La/vx9;->d(II)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_6
    check-cast p0, La/l58;

    .line 214
    .line 215
    check-cast v2, Ljava/lang/CharSequence;

    .line 216
    .line 217
    invoke-virtual {p0, v3, v2}, La/l58;->D0(ILjava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
