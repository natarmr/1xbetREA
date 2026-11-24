.class public final synthetic La/yan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xg;

.field public final synthetic c:La/wim;


# direct methods
.method public synthetic constructor <init>(La/xg;La/wim;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yan;->a:B

    iput-object p1, p0, La/yan;->b:La/xg;

    iput-object p2, p0, La/yan;->c:La/wim;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/yan;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/yan;->c:La/wim;

    .line 4
    .line 5
    iget-object p0, p0, La/yan;->b:La/xg;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {}, La/dyb;->u0()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    new-instance v0, La/yan;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, p0, v1, v2}, La/yan;-><init>(La/xg;La/wim;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
