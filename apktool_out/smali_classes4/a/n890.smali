.class public final synthetic La/n890;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/n890;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/n890;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/feature/office/payment/impl/databinding/FragmentPaymentBrowserBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/s2r;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/n890;->a:La/n890;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0a0335

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    const p0, 0x7f0a04e0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    const p0, 0x7f0a08f8

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/widget/ImageView;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const p0, 0x7f0a096c

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const p0, 0x7f0a096d

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    const p0, 0x7f0a096e

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 71
    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    const p0, 0x7f0a096f

    .line 75
    .line 76
    .line 77
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 82
    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    const p0, 0x7f0a0a7f

    .line 86
    .line 87
    .line 88
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v5, v0

    .line 93
    check-cast v5, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 94
    .line 95
    if-eqz v5, :cond_0

    .line 96
    .line 97
    const p0, 0x7f0a12c9

    .line 98
    .line 99
    .line 100
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-object v6, v0

    .line 105
    check-cast v6, Landroid/widget/TextView;

    .line 106
    .line 107
    if-eqz v6, :cond_0

    .line 108
    .line 109
    const p0, 0x7f0a143f

    .line 110
    .line 111
    .line 112
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_0

    .line 117
    .line 118
    check-cast v0, Landroid/widget/ProgressBar;

    .line 119
    .line 120
    new-instance v7, La/nq8;

    .line 121
    .line 122
    const/16 p0, 0x14

    .line 123
    .line 124
    invoke-direct {v7, v0, v0, p0}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 125
    .line 126
    .line 127
    const p0, 0x7f0a1440

    .line 128
    .line 129
    .line 130
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    move-object v8, v0

    .line 135
    check-cast v8, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 136
    .line 137
    if-eqz v8, :cond_0

    .line 138
    .line 139
    new-instance v1, La/s2r;

    .line 140
    .line 141
    move-object v2, p1

    .line 142
    check-cast v2, Landroid/widget/FrameLayout;

    .line 143
    .line 144
    invoke-direct/range {v1 .. v8}, La/s2r;-><init>(Landroid/widget/FrameLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/lottie/LottieView;Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;Landroid/widget/TextView;La/nq8;Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const-string p1, "Missing required view with ID: "

    .line 157
    .line 158
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const/4 p0, 0x0

    .line 166
    return-object p0
.end method
