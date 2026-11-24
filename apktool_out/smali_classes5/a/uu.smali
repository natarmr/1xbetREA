.class public final synthetic La/uu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xu;


# direct methods
.method public synthetic constructor <init>(La/xu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uu;->a:B

    iput-object p1, p0, La/uu;->b:La/xu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/uu;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/uu;->b:La/xu;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/iqt0;

    .line 9
    .line 10
    sget-object v0, La/xu;->Q1:La/gfk0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/xu;->J0()La/pv;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/pv;->n:La/z4w0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/z4w0;->a(La/iqt0;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 28
    .line 29
    sget-object v0, La/xu;->Q1:La/gfk0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/xu;->J0()La/pv;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v1, La/t0;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    const/16 v8, 0x16

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    const-class v4, La/pv;

    .line 49
    .line 50
    const-string v5, "onLaunchJobError"

    .line 51
    .line 52
    const-string v6, "onLaunchJobError(Ljava/lang/Throwable;)V"

    .line 53
    .line 54
    invoke-direct/range {v1 .. v8}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 55
    .line 56
    .line 57
    new-instance p1, La/oa;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-direct {p1, v3, v0, v2}, La/oa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, p0, v1, p1}, La/pv;->w(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
