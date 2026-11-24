.class public final La/hc3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/jg;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/hc3;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, La/hc3;->b:I

    iput-object p2, p0, La/hc3;->c:Ljava/lang/Object;

    iput-object p3, p0, La/hc3;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/dc3;La/do20;Landroid/view/ViewGroup;I)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput-byte p2, p0, La/hc3;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/hc3;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, La/hc3;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput p4, p0, La/hc3;->b:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/p8l;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/hc3;->a:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, La/hc3;->c:Ljava/lang/Object;

    iput p2, p0, La/hc3;->b:I

    iput-object p3, p0, La/hc3;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-byte p2, p0, La/hc3;->a:B

    .line 2
    .line 3
    iget p3, p0, La/hc3;->b:I

    .line 4
    .line 5
    iget-object p4, p0, La/hc3;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p5, p0, La/hc3;->d:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p5, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 13
    .line 14
    check-cast p4, La/jg;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    const/4 p1, 0x1

    .line 24
    if-nez p3, :cond_0

    .line 25
    .line 26
    move p2, p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p2, p0

    .line 29
    :goto_0
    iget-object p6, p4, La/jg;->j:Landroid/view/View;

    .line 30
    .line 31
    check-cast p6, Landroid/widget/ImageView;

    .line 32
    .line 33
    iget-object p7, p4, La/jg;->j:Landroid/view/View;

    .line 34
    .line 35
    check-cast p7, Landroid/widget/ImageView;

    .line 36
    .line 37
    iget-object p4, p4, La/jg;->i:Landroid/view/View;

    .line 38
    .line 39
    check-cast p4, Landroid/widget/ImageView;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 p0, 0x8

    .line 45
    .line 46
    :goto_1
    invoke-virtual {p6, p0}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    if-nez p3, :cond_4

    .line 50
    .line 51
    sget p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->z:I

    .line 52
    .line 53
    invoke-virtual {p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    const p0, 0x7f080a4a

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const p0, 0x7f080a49

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-virtual {p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    const p2, 0x7f080a3a

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    const p2, 0x7f080a39

    .line 77
    .line 78
    .line 79
    :goto_3
    invoke-virtual {p4, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p7, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 83
    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_4
    sget p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->z:I

    .line 87
    .line 88
    invoke-virtual {p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_5

    .line 93
    .line 94
    const p0, 0x7f0809dc

    .line 95
    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    const p0, 0x7f0809db

    .line 99
    .line 100
    .line 101
    :goto_4
    invoke-virtual {p4, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 102
    .line 103
    .line 104
    :goto_5
    iget p0, p5, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 105
    .line 106
    if-ne p0, p1, :cond_6

    .line 107
    .line 108
    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const p1, 0x7f040b5f

    .line 116
    .line 117
    .line 118
    invoke-static {p1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    invoke-virtual {p4, p0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {p1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-virtual {p7, p0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 137
    .line 138
    .line 139
    :cond_6
    return-void

    .line 140
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 144
    .line 145
    .line 146
    check-cast p4, La/p8l;

    .line 147
    .line 148
    invoke-virtual {p4}, La/p8l;->m()La/o7l;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    iget-object p1, p4, La/p8l;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, La/p7l;

    .line 155
    .line 156
    iget p2, p1, La/p7l;->w:I

    .line 157
    .line 158
    int-to-float p2, p2

    .line 159
    iget p4, p1, La/p7l;->e:F

    .line 160
    .line 161
    mul-float/2addr p2, p4

    .line 162
    invoke-static {p2}, La/si30;->b(F)I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    iget p4, p1, La/p7l;->v:F

    .line 167
    .line 168
    iget p1, p1, La/p7l;->e:F

    .line 169
    .line 170
    mul-float/2addr p4, p1

    .line 171
    check-cast p5, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p0, p4, p3, p2, p5}, La/o7l;->j(FIILjava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 178
    .line 179
    .line 180
    check-cast p4, La/dc3;

    .line 181
    .line 182
    iget-object p0, p4, La/dc3;->b:Landroid/view/ViewGroup;

    .line 183
    .line 184
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/motion/AppBarMotionLayout;

    .line 185
    .line 186
    invoke-virtual {p0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getCurrentState()I

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    const p1, 0x7f0a0e75

    .line 191
    .line 192
    .line 193
    if-ne p0, p1, :cond_7

    .line 194
    .line 195
    check-cast p5, Landroid/view/ViewGroup;

    .line 196
    .line 197
    invoke-static {p5, p3}, La/do20;->q(Landroid/view/ViewGroup;I)V

    .line 198
    .line 199
    .line 200
    :cond_7
    return-void

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
