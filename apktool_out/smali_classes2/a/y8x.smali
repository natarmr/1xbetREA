.class public final synthetic La/y8x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/adw;


# direct methods
.method public synthetic constructor <init>(La/adw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y8x;->a:B

    iput-object p1, p0, La/y8x;->b:La/adw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/y8x;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y8x;->b:La/adw;

    .line 4
    .line 5
    check-cast p1, La/cp;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, La/z8x;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, p0, p1, v2}, La/z8x;-><init>(La/adw;La/cp;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 25
    .line 26
    .line 27
    new-instance p0, La/ctv;

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v1, La/z8x;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v1, p0, p1, v2}, La/z8x;-><init>(La/adw;La/cp;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 54
    .line 55
    .line 56
    new-instance p0, La/ctv;

    .line 57
    .line 58
    const/4 v0, 0x2

    .line 59
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
