.class public final synthetic La/k8b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9b0;


# direct methods
.method public synthetic constructor <init>(La/g9b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k8b0;->a:B

    iput-object p1, p0, La/k8b0;->b:La/g9b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k8b0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/k8b0;->b:La/g9b0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/g9b0;->F:La/p7m0;

    .line 10
    .line 11
    new-instance v0, La/v8b0;

    .line 12
    .line 13
    invoke-direct {v0, v1}, La/v8b0;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    iget-object p0, p0, La/g9b0;->E:La/ouu;

    .line 27
    .line 28
    new-instance v0, La/bb50;

    .line 29
    .line 30
    invoke-direct {v0, v1}, La/bb50;-><init>(Z)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-virtual {p0, v0, v1}, La/ouu;->q(La/cb50;Z)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
