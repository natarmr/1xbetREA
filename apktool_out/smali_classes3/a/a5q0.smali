.class public final La/a5q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/Drawable;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a5q0;->a:B

    iput-object p1, p0, La/a5q0;->b:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/a5q0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    iget-object p0, p0, La/a5q0;->b:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/16 v3, 0x10

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, La/y3d;

    .line 15
    .line 16
    iget-wide v5, p1, La/y3d;->a:J

    .line 17
    .line 18
    check-cast p2, La/fet;

    .line 19
    .line 20
    check-cast p3, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    and-int/lit8 p3, p1, 0x11

    .line 27
    .line 28
    if-eq p3, v3, :cond_0

    .line 29
    .line 30
    move v2, v4

    .line 31
    :cond_0
    and-int/2addr p1, v4

    .line 32
    invoke-virtual {p2, p1, v2}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    sget-object p1, La/hfk0;->d:La/hfk0;

    .line 39
    .line 40
    invoke-virtual {p1, p0, p2, v1}, La/hfk0;->h(Landroid/graphics/drawable/Drawable;La/fet;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    check-cast p1, La/y3d;

    .line 51
    .line 52
    iget-wide v5, p1, La/y3d;->a:J

    .line 53
    .line 54
    check-cast p2, La/fet;

    .line 55
    .line 56
    check-cast p3, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    and-int/lit8 p3, p1, 0x11

    .line 63
    .line 64
    if-eq p3, v3, :cond_2

    .line 65
    .line 66
    move v2, v4

    .line 67
    :cond_2
    and-int/2addr p1, v4

    .line 68
    invoke-virtual {p2, p1, v2}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    sget-object p1, La/hfk0;->d:La/hfk0;

    .line 75
    .line 76
    invoke-virtual {p1, p0, p2, v1}, La/hfk0;->h(Landroid/graphics/drawable/Drawable;La/fet;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 81
    .line 82
    .line 83
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
