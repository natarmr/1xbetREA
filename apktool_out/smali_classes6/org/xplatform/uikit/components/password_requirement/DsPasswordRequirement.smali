.class public final Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:La/dc3;

.field public b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v2, 0x7f0d0506

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    const v2, 0x7f0a003c

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    move-object v6, v3

    .line 36
    check-cast v6, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 37
    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    const v2, 0x7f0a0129

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Landroidx/constraintlayout/widget/Barrier;

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    const v2, 0x7f0a0864

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Landroid/widget/ImageView;

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    const v2, 0x7f0a0c1e

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move-object v7, v3

    .line 70
    check-cast v7, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 71
    .line 72
    if-eqz v7, :cond_1

    .line 73
    .line 74
    const v2, 0x7f0a1260

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    move-object v8, v3

    .line 82
    check-cast v8, Landroid/widget/TextView;

    .line 83
    .line 84
    if-eqz v8, :cond_1

    .line 85
    .line 86
    new-instance v4, La/dc3;

    .line 87
    .line 88
    move-object v5, v1

    .line 89
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 90
    .line 91
    const/16 v9, 0x8

    .line 92
    .line 93
    invoke-direct/range {v4 .. v9}, La/dc3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    iput-object v4, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->a:La/dc3;

    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->b:Z

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Landroid/view/View;->setClipToOutline(Z)V

    .line 102
    .line 103
    .line 104
    sget-object v0, La/bqd0;->W:[I

    .line 105
    .line 106
    invoke-virtual {p1, p2, v0, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-boolean p2, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->b:Z

    .line 111
    .line 112
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->setExpandable(Z)V

    .line 117
    .line 118
    .line 119
    new-instance p2, La/ccf;

    .line 120
    .line 121
    const/16 p3, 0x10

    .line 122
    .line 123
    invoke-direct {p2, p0, p3}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 127
    .line 128
    .line 129
    new-instance p2, La/jw5;

    .line 130
    .line 131
    const/4 p3, 0x5

    .line 132
    invoke-direct {p2, p0, p3}, La/jw5;-><init>(Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    const-string p1, "Missing required view with ID: "

    .line 151
    .line 152
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0
.end method


# virtual methods
.method public final setExpandable(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->b:Z

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->a:La/dc3;

    .line 4
    .line 5
    iget-object v0, p0, La/dc3;->c:Landroid/view/View;

    .line 6
    .line 7
    check-cast v0, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    move v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/dc3;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    move v1, v2

    .line 27
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setOnBlockClickListener(Landroid/view/View$OnClickListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->a:La/dc3;

    .line 2
    .line 3
    iget-object v0, v0, La/dc3;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 6
    .line 7
    new-instance v1, La/wg;

    .line 8
    .line 9
    const/16 v2, 0x12

    .line 10
    .line 11
    invoke-direct {v1, p1, p0, v2}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setRequirements(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->a:La/dc3;

    .line 5
    .line 6
    iget-object v0, p0, La/dc3;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/dc3;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;->setLabels(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->setTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit/components/password_requirement/DsPasswordRequirement;->a:La/dc3;

    iget-object p0, p0, La/dc3;->e:Ljava/lang/Object;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
