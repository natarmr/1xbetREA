.class public final La/dyk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:La/hyk0;


# direct methods
.method public constructor <init>(La/hyk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dyk0;->a:La/hyk0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 4
    .line 5
    iget-object v1, v0, La/dyk0;->a:La/hyk0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v2, v2, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/x4r;->b:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 25
    .line 26
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v2, v2, La/x4r;->f:Landroidx/constraintlayout/widget/Guideline;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v3, v3, La/x4r;->d:Landroidx/constraintlayout/widget/Guideline;

    .line 41
    .line 42
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v4, v4, La/x4r;->e:Landroidx/constraintlayout/widget/Guideline;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-virtual {v0, v2, v3, v4}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->b(III)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 64
    .line 65
    new-instance v2, La/byk0;

    .line 66
    .line 67
    const/4 v3, 0x2

    .line 68
    invoke-direct {v2, v1, v3}, La/byk0;-><init>(La/hyk0;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;->setAnimationEndListener(Lkotlin/jvm/functions/Function0;)V

    .line 72
    .line 73
    .line 74
    iget-boolean v0, v1, La/hyk0;->R1:Z

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    if-nez v0, :cond_0

    .line 78
    .line 79
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v0, v0, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {v1}, La/hyk0;->G0()La/x4r;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-object v4, v4, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 94
    .line 95
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    sub-int/2addr v0, v4

    .line 100
    neg-int v0, v0

    .line 101
    invoke-virtual {v1}, La/hyk0;->H0()La/tyk0;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v5, La/dav0;

    .line 106
    .line 107
    invoke-direct {v5, v0}, La/dav0;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    new-instance v7, La/ejk0;

    .line 115
    .line 116
    const/16 v0, 0xc

    .line 117
    .line 118
    invoke-direct {v7, v0}, La/ejk0;-><init>(B)V

    .line 119
    .line 120
    .line 121
    new-instance v10, La/kbh0;

    .line 122
    .line 123
    const/16 v0, 0x18

    .line 124
    .line 125
    invoke-direct {v10, v4, v5, v2, v0}, La/kbh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 126
    .line 127
    .line 128
    const/16 v11, 0xe

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 133
    .line 134
    .line 135
    :cond_0
    invoke-virtual {v1}, La/hyk0;->H0()La/tyk0;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    iget-object v0, v14, La/tyk0;->d:La/vcu;

    .line 140
    .line 141
    invoke-virtual {v0}, La/vcu;->a()La/vrs;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    const/4 v4, 0x1

    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    if-eq v0, v4, :cond_2

    .line 153
    .line 154
    if-ne v0, v3, :cond_1

    .line 155
    .line 156
    invoke-virtual {v14}, La/tyk0;->F()V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_2
    invoke-virtual {v14}, La/tyk0;->F()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v14}, La/tyk0;->w()V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_3
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    new-instance v6, La/gvj0;

    .line 176
    .line 177
    const/16 v18, 0x0

    .line 178
    .line 179
    const/16 v19, 0x16

    .line 180
    .line 181
    const/4 v13, 0x1

    .line 182
    const-class v15, La/tyk0;

    .line 183
    .line 184
    const-string v16, "handleGameError"

    .line 185
    .line 186
    const-string v17, "handleGameError(Ljava/lang/Throwable;)V"

    .line 187
    .line 188
    move-object v12, v6

    .line 189
    invoke-direct/range {v12 .. v19}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 190
    .line 191
    .line 192
    iget-object v0, v14, La/tyk0;->v:La/mne;

    .line 193
    .line 194
    iget-object v8, v0, La/mne;->a:La/rwj;

    .line 195
    .line 196
    new-instance v9, La/oyk0;

    .line 197
    .line 198
    invoke-direct {v9, v14, v2, v3}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 199
    .line 200
    .line 201
    const/16 v10, 0xa

    .line 202
    .line 203
    const/4 v7, 0x0

    .line 204
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 205
    .line 206
    .line 207
    :goto_0
    invoke-virtual {v1}, La/hyk0;->H0()La/tyk0;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iput-boolean v4, v0, La/tyk0;->C:Z

    .line 212
    .line 213
    return-void
.end method
