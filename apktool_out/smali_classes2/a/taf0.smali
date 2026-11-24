.class public final La/taf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/Window;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/taf0;->a:B

    iput-object p1, p0, La/taf0;->b:Landroid/view/Window;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/taf0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/taf0;->b:Landroid/view/Window;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-eqz p0, :cond_4

    .line 9
    .line 10
    sget-object v0, La/exv0;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/dxv0;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget v2, v1, La/dxv0;->c:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    iput v2, v1, La/dxv0;->c:I

    .line 26
    .line 27
    if-gtz v2, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v3, La/ani0;

    .line 34
    .line 35
    invoke-direct {v3, v2}, La/ani0;-><init>(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    const/16 v4, 0x23

    .line 41
    .line 42
    if-lt v2, v4, :cond_1

    .line 43
    .line 44
    new-instance v2, La/bjv0;

    .line 45
    .line 46
    invoke-direct {v2, p0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/16 v4, 0x1e

    .line 51
    .line 52
    if-lt v2, v4, :cond_2

    .line 53
    .line 54
    new-instance v2, La/ajv0;

    .line 55
    .line 56
    invoke-direct {v2, p0, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const/16 v4, 0x1a

    .line 61
    .line 62
    if-lt v2, v4, :cond_3

    .line 63
    .line 64
    new-instance v2, La/ziv0;

    .line 65
    .line 66
    invoke-direct {v2, p0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    new-instance v2, La/yiv0;

    .line 71
    .line 72
    invoke-direct {v2, p0, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    iget-boolean v3, v1, La/dxv0;->a:Z

    .line 76
    .line 77
    invoke-virtual {v2, v3}, La/ycm0;->w(Z)V

    .line 78
    .line 79
    .line 80
    iget-boolean v1, v1, La/dxv0;->b:Z

    .line 81
    .line 82
    invoke-virtual {v2, v1}, La/ycm0;->v(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_1
    return-void

    .line 89
    :pswitch_0
    if-eqz p0, :cond_5

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    invoke-static {p0, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
