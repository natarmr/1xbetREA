.class public final La/sbu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/x5s;


# direct methods
.method public constructor <init>(La/x5s;B)V
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
    iput-object p1, p0, La/sbu;->a:La/x5s;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/sbu;->a:La/x5s;

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
.method public a(La/v5s;)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object p0, p0, La/sbu;->a:La/x5s;

    .line 2
    .line 3
    iget-object p0, p0, La/x5s;->a:La/i5s;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/i5s;->a:La/p7m0;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    sget-object p1, La/wne;->a:La/wne;

    .line 17
    .line 18
    return-object p0
.end method
