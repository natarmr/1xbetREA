.class public final La/aqx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p6t;


# direct methods
.method public constructor <init>(La/p6t;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/aqx;->a:La/p6t;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/aqx;->a:La/p6t;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/dqk0;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/aqx;->a:La/p6t;

    .line 2
    .line 3
    iget-object p0, p0, La/p6t;->b:La/n6t;

    .line 4
    .line 5
    iget-object p0, p0, La/n6t;->a:La/ouu;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, La/ouu;->O(La/dqk0;La/yje;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/wne;->a:La/wne;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    :goto_0
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    :goto_1
    if-ne p0, p1, :cond_2

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method
