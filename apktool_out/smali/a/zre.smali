.class public final synthetic La/zre;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zre;->a:B

    iput-object p1, p0, La/zre;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/zre;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zre;->b:La/cp;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, La/qth;

    .line 12
    .line 13
    iget-object v1, v1, La/qth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const-string v3, "-"

    .line 21
    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/m4k0;

    .line 29
    .line 30
    iget-object v1, v1, La/m4k0;->d:La/g4k0;

    .line 31
    .line 32
    iget-object v1, v1, La/g4k0;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/m4k0;

    .line 39
    .line 40
    iget-object p0, p0, La/m4k0;->d:La/g4k0;

    .line 41
    .line 42
    iget-object p0, p0, La/g4k0;->b:Ljava/lang/String;

    .line 43
    .line 44
    :goto_0
    invoke-static {v1, v3, p0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/m4k0;

    .line 54
    .line 55
    iget-object v1, v1, La/m4k0;->d:La/g4k0;

    .line 56
    .line 57
    iget-object v1, v1, La/g4k0;->b:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/m4k0;

    .line 64
    .line 65
    iget-object p0, p0, La/m4k0;->d:La/g4k0;

    .line 66
    .line 67
    iget-object p0, p0, La/g4k0;->a:Ljava/lang/String;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    check-cast v0, La/qth;

    .line 71
    .line 72
    iget-object v0, v0, La/qth;->g:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_0
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 79
    .line 80
    move-object v1, v0

    .line 81
    check-cast v1, La/jth;

    .line 82
    .line 83
    iget-object v1, v1, La/jth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    const-string v2, ":"

    .line 90
    .line 91
    if-nez v1, :cond_1

    .line 92
    .line 93
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/cov;

    .line 98
    .line 99
    iget-object v1, v1, La/cov;->j:La/vnv;

    .line 100
    .line 101
    iget-object v1, v1, La/vnv;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, La/cov;

    .line 108
    .line 109
    iget-object p0, p0, La/cov;->j:La/vnv;

    .line 110
    .line 111
    iget-object p0, p0, La/vnv;->b:Ljava/lang/String;

    .line 112
    .line 113
    :goto_2
    invoke-static {v1, v2, p0}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    goto :goto_3

    .line 118
    :cond_1
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, La/cov;

    .line 123
    .line 124
    iget-object v1, v1, La/cov;->j:La/vnv;

    .line 125
    .line 126
    iget-object v1, v1, La/vnv;->b:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, La/cov;

    .line 133
    .line 134
    iget-object p0, p0, La/cov;->j:La/vnv;

    .line 135
    .line 136
    iget-object p0, p0, La/vnv;->a:Ljava/lang/String;

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_3
    check-cast v0, La/jth;

    .line 140
    .line 141
    iget-object v0, v0, La/jth;->g:Landroid/widget/TextView;

    .line 142
    .line 143
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_1
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 148
    .line 149
    check-cast v0, La/hth;

    .line 150
    .line 151
    iget-object v0, v0, La/hth;->e:Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, La/tog;

    .line 158
    .line 159
    iget-object p0, p0, La/tog;->a:La/oog;

    .line 160
    .line 161
    iget-object p0, p0, La/oog;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_2
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 168
    .line 169
    check-cast p0, La/rcu0;

    .line 170
    .line 171
    iget-object p0, p0, La/rcu0;->b:Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;

    .line 172
    .line 173
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 174
    .line 175
    iget-object p0, p0, La/tbc;->g:Landroid/view/View;

    .line 176
    .line 177
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 178
    .line 179
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
