.class public final La/y63;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/y63;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p2, p0, La/y63;->b:I

    .line 8
    .line 9
    iput-object p1, p0, La/y63;->c:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/y63;->a:B

    iput-object p1, p0, La/y63;->c:Ljava/lang/Object;

    iput p2, p0, La/y63;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-byte v0, p0, La/y63;->a:B

    .line 2
    .line 3
    iget v1, p0, La/y63;->b:I

    .line 4
    .line 5
    iget-object v2, p0, La/y63;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, La/h9w0;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, La/h9w0;->c(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    check-cast v2, Lcom/google/android/material/datepicker/e;

    .line 23
    .line 24
    iget-object p0, v2, Lcom/google/android/material/datepicker/e;->O1:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    check-cast v2, La/owp0;

    .line 31
    .line 32
    iget-object p0, v2, La/owp0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/xvw;

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0, v1}, La/xvw;->T(I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_3
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;

    .line 43
    .line 44
    iget-object v0, v2, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 45
    .line 46
    if-eq v0, p0, :cond_1

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v0, v2, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast v0, Landroid/widget/TextView;

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    new-array v4, v3, [F

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    aput v6, v4, v5

    .line 72
    .line 73
    const-string v7, "scaleX"

    .line 74
    .line 75
    invoke-static {v0, v7, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    new-array v4, v3, [F

    .line 83
    .line 84
    aput v6, v4, v5

    .line 85
    .line 86
    const-string v8, "scaleY"

    .line 87
    .line 88
    invoke-static {v0, v8, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    new-array v4, v3, [F

    .line 96
    .line 97
    aput v6, v4, v5

    .line 98
    .line 99
    const-string v6, "alpha"

    .line 100
    .line 101
    invoke-static {v0, v6, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    iget-object v0, v2, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    check-cast v0, Landroid/widget/TextView;

    .line 118
    .line 119
    new-array v1, v3, [F

    .line 120
    .line 121
    const/high16 v4, 0x3f800000    # 1.0f

    .line 122
    .line 123
    aput v4, v1, v5

    .line 124
    .line 125
    invoke-static {v0, v7, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    new-array v1, v3, [F

    .line 133
    .line 134
    aput v4, v1, v5

    .line 135
    .line 136
    invoke-static {v0, v8, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    new-array v1, v3, [F

    .line 144
    .line 145
    aput v4, v1, v5

    .line 146
    .line 147
    invoke-static {v0, v6, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 155
    .line 156
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 157
    .line 158
    .line 159
    const-wide/16 v3, 0x96

    .line 160
    .line 161
    invoke-virtual {v0, v3, v4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 165
    .line 166
    .line 167
    new-instance p0, La/x63;

    .line 168
    .line 169
    invoke-direct {p0, v2, v5}, La/x63;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 176
    .line 177
    .line 178
    iput-object v0, v2, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 179
    .line 180
    :goto_0
    return-void

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
