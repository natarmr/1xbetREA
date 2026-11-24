.class public final synthetic La/owv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rwv;


# direct methods
.method public synthetic constructor <init>(La/rwv;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/owv;->a:B

    iput-object p1, p0, La/owv;->b:La/rwv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/owv;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/owv;->b:La/rwv;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/rwv;->P1:La/sqt;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/rwv;->N1:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/uwv;

    .line 22
    .line 23
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, La/umu;

    .line 28
    .line 29
    const/16 p1, 0x18

    .line 30
    .line 31
    invoke-direct {v1, p1}, La/umu;-><init>(B)V

    .line 32
    .line 33
    .line 34
    new-instance v4, La/e3p;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    const/4 v2, 0x6

    .line 38
    invoke-direct {v4, p0, p1, v2}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 39
    .line 40
    .line 41
    const/16 v5, 0xe

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    sget-object v0, La/rwv;->P1:La/sqt;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, La/rwv;->N1:La/kiu0;

    .line 57
    .line 58
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, La/uwv;

    .line 63
    .line 64
    iget-object v0, p0, La/rwv;->O1:La/cgx0;

    .line 65
    .line 66
    sget-object v1, La/rwv;->Q1:[La/iiy;

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    aget-object v1, v1, v2

    .line 70
    .line 71
    invoke-virtual {v0, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-virtual {p1, p0}, La/uwv;->w(Z)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
