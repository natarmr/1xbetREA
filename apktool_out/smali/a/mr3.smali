.class public final synthetic La/mr3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLa/hie0;La/jie0;Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/mr3;->a:B

    iput-object p2, p0, La/mr3;->c:Ljava/lang/Object;

    iput-object p4, p0, La/mr3;->b:Landroid/view/View;

    iput-object p3, p0, La/mr3;->d:Ljava/lang/Object;

    iput-object p5, p0, La/mr3;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/View;La/w6k;La/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/mr3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mr3;->b:Landroid/view/View;

    iput-object p2, p0, La/mr3;->c:Ljava/lang/Object;

    iput-object p3, p0, La/mr3;->d:Ljava/lang/Object;

    iput-object p4, p0, La/mr3;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 6

    .line 1
    iget-byte v0, p0, La/mr3;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mr3;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/mr3;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/mr3;->b:Landroid/view/View;

    .line 8
    .line 9
    iget-object p0, p0, La/mr3;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/hie0;

    .line 15
    .line 16
    check-cast v2, La/jie0;

    .line 17
    .line 18
    check-cast v1, La/pz40;

    .line 19
    .line 20
    iget-boolean p0, p0, La/hie0;->a:Z

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v3, v2, v1}, La/osm0;->n(Landroid/view/View;La/jie0;La/pz40;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :pswitch_0
    check-cast p0, Landroid/view/View;

    .line 30
    .line 31
    check-cast v2, La/w6k;

    .line 32
    .line 33
    check-cast v1, La/pz40;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const v0, 0x7f0a0e2d

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v5, 0x2

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-array v3, v5, [I

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationInWindow([I)V

    .line 52
    .line 53
    .line 54
    aget v0, v3, v4

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    :goto_1
    new-instance v3, Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 70
    .line 71
    new-array v5, v5, [I

    .line 72
    .line 73
    invoke-virtual {p0, v5}, Landroid/view/View;->getLocationInWindow([I)V

    .line 74
    .line 75
    .line 76
    aget v4, v5, v4

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v4

    .line 83
    if-ge v3, v0, :cond_2

    .line 84
    .line 85
    sub-int/2addr p0, v3

    .line 86
    invoke-interface {v2, p0}, La/w6k;->r0(I)F

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    sub-int/2addr p0, v0

    .line 92
    invoke-interface {v2, p0}, La/w6k;->r0(I)F

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    :goto_2
    sget-object v0, La/qmk;->a:La/zcl;

    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    cmpg-float v2, p0, v0

    .line 100
    .line 101
    if-gez v2, :cond_3

    .line 102
    .line 103
    move p0, v0

    .line 104
    :cond_3
    new-instance v0, La/ycl;

    .line 105
    .line 106
    invoke-direct {v0, p0}, La/ycl;-><init>(F)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v1, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_1
    check-cast p0, La/hie0;

    .line 114
    .line 115
    check-cast v2, La/jie0;

    .line 116
    .line 117
    check-cast v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 118
    .line 119
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 120
    .line 121
    iget-boolean p0, p0, La/hie0;->a:Z

    .line 122
    .line 123
    if-eqz p0, :cond_4

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_4
    invoke-static {v3, v2, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->y(Landroid/view/View;La/jie0;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
