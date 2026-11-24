.class public final synthetic La/gxm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/xcz;

.field public final synthetic d:La/xcz;


# direct methods
.method public synthetic constructor <init>(La/vne;La/xcz;La/xcz;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gxm;->a:B

    iput-object p1, p0, La/gxm;->b:La/vne;

    iput-object p2, p0, La/gxm;->c:La/xcz;

    iput-object p3, p0, La/gxm;->d:La/xcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/gxm;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/gxm;->b:La/vne;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Float;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result v5

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v3, La/hxm;

    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    iget-object v4, p0, La/gxm;->c:La/xcz;

    .line 19
    .line 20
    iget-object v6, p0, La/gxm;->d:La/xcz;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-direct/range {v3 .. v8}, La/hxm;-><init>(La/xcz;FLa/xcz;La/yje;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    new-instance v3, La/hxm;

    .line 31
    .line 32
    const/4 v8, 0x2

    .line 33
    iget-object v4, p0, La/gxm;->c:La/xcz;

    .line 34
    .line 35
    iget-object v6, p0, La/gxm;->d:La/xcz;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-direct/range {v3 .. v8}, La/hxm;-><init>(La/xcz;FLa/xcz;La/yje;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_1
    new-instance v3, La/hxm;

    .line 46
    .line 47
    const/4 v8, 0x1

    .line 48
    iget-object v4, p0, La/gxm;->c:La/xcz;

    .line 49
    .line 50
    iget-object v6, p0, La/gxm;->d:La/xcz;

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    invoke-direct/range {v3 .. v8}, La/hxm;-><init>(La/xcz;FLa/xcz;La/yje;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_2
    new-instance v3, La/hxm;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    iget-object v4, p0, La/gxm;->c:La/xcz;

    .line 64
    .line 65
    iget-object v6, p0, La/gxm;->d:La/xcz;

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-direct/range {v3 .. v8}, La/hxm;-><init>(La/xcz;FLa/xcz;La/yje;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
