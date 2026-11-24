.class public final La/pa6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bxq0;


# direct methods
.method public synthetic constructor <init>(La/bxq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pa6;->a:B

    iput-object p1, p0, La/pa6;->b:La/bxq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/pa6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/pa6;->b:La/bxq0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, La/oa6;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v0, p1, p0, v1, v2}, La/oa6;-><init>(La/hpa0;La/bxq0;La/yje;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/wne;->a:La/wne;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    :goto_0
    return-object p0

    .line 27
    :pswitch_0
    new-instance v0, La/oa6;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, p1, p0, v1, v2}, La/oa6;-><init>(La/hpa0;La/bxq0;La/yje;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object p1, La/wne;->a:La/wne;

    .line 38
    .line 39
    if-ne p0, p1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    :goto_1
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
