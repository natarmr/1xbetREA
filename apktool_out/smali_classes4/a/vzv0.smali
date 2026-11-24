.class public final La/vzv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vzv0;->a:B

    iput-object p1, p0, La/vzv0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/vzv0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/vzv0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/vzv0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, La/vzv0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/egf;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v2, La/egf;

    .line 25
    .line 26
    const v0, 0x7f0d05b8

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {p0, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    const v0, 0x7f0a07fe

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/widget/ImageView;

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    const v0, 0x7f0a081e

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Landroid/widget/ImageView;

    .line 56
    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    const v0, 0x7f0a08ef

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;

    .line 67
    .line 68
    if-eqz v4, :cond_0

    .line 69
    .line 70
    new-instance v1, La/c1o0;

    .line 71
    .line 72
    check-cast p0, Landroid/widget/FrameLayout;

    .line 73
    .line 74
    invoke-direct {v1, p0, v2, v3, v4}, La/c1o0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string v0, "Missing required view with ID: "

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-object v1

    .line 96
    :pswitch_0
    check-cast v2, La/a8z;

    .line 97
    .line 98
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/riu0;

    .line 103
    .line 104
    instance-of v2, v0, La/wmv;

    .line 105
    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    move-object v1, v0

    .line 109
    check-cast v1, La/wmv;

    .line 110
    .line 111
    :cond_1
    if-eqz v1, :cond_2

    .line 112
    .line 113
    invoke-interface {v1}, La/wmv;->n()La/miu0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez v0, :cond_3

    .line 118
    .line 119
    :cond_2
    check-cast p0, La/wzv0;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :cond_3
    return-object v0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
