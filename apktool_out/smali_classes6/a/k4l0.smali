.class public final synthetic La/k4l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l4l0;


# direct methods
.method public synthetic constructor <init>(La/l4l0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k4l0;->a:B

    iput-object p1, p0, La/k4l0;->b:La/l4l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/k4l0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/k4l0;->b:La/l4l0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/bte;

    .line 11
    .line 12
    iget v1, p0, La/l4l0;->e:I

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, La/bte;-><init>(Landroid/view/ViewGroup;I)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/yte;

    .line 24
    .line 25
    const v1, 0x7f140837

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, La/yte;-><init>(Landroid/view/ViewGroup;I)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    new-instance v0, La/yte;

    .line 38
    .line 39
    const v1, 0x7f14083b

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, La/yte;-><init>(Landroid/view/ViewGroup;I)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_2
    new-instance v0, La/yte;

    .line 52
    .line 53
    const v1, 0x7f140841

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, p0, v1}, La/yte;-><init>(Landroid/view/ViewGroup;I)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_3
    new-instance v0, La/yte;

    .line 66
    .line 67
    const v1, 0x7f140845

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, p0, v1}, La/yte;-><init>(Landroid/view/ViewGroup;I)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    const/16 p0, 0x8

    .line 79
    .line 80
    invoke-virtual {v1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_4
    new-instance v0, La/yte;

    .line 85
    .line 86
    const v1, 0x7f140844

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, p0, v1}, La/yte;-><init>(Landroid/view/ViewGroup;I)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 93
    .line 94
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_5
    new-instance v0, La/eue;

    .line 99
    .line 100
    const v1, 0x7fffffff

    .line 101
    .line 102
    .line 103
    const v3, 0x7f140476

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, v1, v2, v3, p0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_6
    new-instance v0, La/eue;

    .line 111
    .line 112
    const v3, 0x7f14046f

    .line 113
    .line 114
    .line 115
    invoke-direct {v0, v1, v2, v3, p0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_7
    new-instance v0, La/eue;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const v3, 0x7f0706e1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    const v3, 0x7f140463

    .line 133
    .line 134
    .line 135
    invoke-direct {v0, v1, v2, v3, p0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_8
    new-instance v0, La/od5;

    .line 140
    .line 141
    invoke-direct {v0, p0}, La/od5;-><init>(Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
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
