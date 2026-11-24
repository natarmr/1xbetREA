.class public final synthetic La/d33;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bhu0;

.field public final synthetic c:La/e7z;


# direct methods
.method public synthetic constructor <init>(La/bhu0;La/e7z;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/d33;->a:B

    iput-object p1, p0, La/d33;->b:La/bhu0;

    iput-object p2, p0, La/d33;->c:La/e7z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/d33;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/d33;->c:La/e7z;

    .line 5
    .line 6
    iget-object p0, p0, La/d33;->b:La/bhu0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/ou90;

    .line 12
    .line 13
    invoke-static {p0, v2}, La/aad;->U(La/bhu0;La/e7z;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object v0, p0, La/k33;->b:Landroid/view/View;

    .line 20
    .line 21
    check-cast p1, La/cg80;

    .line 22
    .line 23
    instance-of v3, p1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, La/p33;->getHolderToLayoutNode()Ljava/util/HashMap;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui()La/p33;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, La/p33;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 63
    .line 64
    .line 65
    new-instance v1, La/jx2;

    .line 66
    .line 67
    invoke-direct {v1, p1, v2, p1}, La/jx2;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;La/e7z;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v1}, La/rgu0;->o(Landroid/view/View;La/p6;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eq p1, p0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_1
    check-cast p1, La/j6z;

    .line 86
    .line 87
    invoke-static {p0, v2}, La/aad;->U(La/bhu0;La/e7z;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, La/k33;->c:La/cg80;

    .line 91
    .line 92
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 93
    .line 94
    iput-boolean v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->g1:Z

    .line 95
    .line 96
    iget-object v0, p0, La/k33;->n:[I

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    aget v3, v0, v2

    .line 100
    .line 101
    aget v4, v0, v1

    .line 102
    .line 103
    iget-object v5, p0, La/k33;->b:Landroid/view/View;

    .line 104
    .line 105
    invoke-virtual {v5, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 106
    .line 107
    .line 108
    iget-wide v6, p0, La/k33;->o:J

    .line 109
    .line 110
    invoke-interface {p1}, La/j6z;->g()J

    .line 111
    .line 112
    .line 113
    move-result-wide v8

    .line 114
    iput-wide v8, p0, La/k33;->o:J

    .line 115
    .line 116
    iget-object p1, p0, La/k33;->p:La/xiv0;

    .line 117
    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    aget v2, v0, v2

    .line 121
    .line 122
    if-ne v3, v2, :cond_3

    .line 123
    .line 124
    aget v0, v0, v1

    .line 125
    .line 126
    if-ne v4, v0, :cond_3

    .line 127
    .line 128
    invoke-static {v6, v7, v8, v9}, La/qkx;->a(JJ)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    :cond_3
    invoke-virtual {p0, p1}, La/k33;->k(La/xiv0;)La/xiv0;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0}, La/xiv0;->g()Landroid/view/WindowInsets;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-eqz p0, :cond_4

    .line 143
    .line 144
    invoke-virtual {v5, p0}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 145
    .line 146
    .line 147
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
