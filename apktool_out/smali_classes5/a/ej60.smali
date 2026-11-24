.class public final La/ej60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k3t0;

.field public final synthetic c:La/lk60;


# direct methods
.method public synthetic constructor <init>(La/k3t0;La/lk60;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ej60;->a:B

    iput-object p1, p0, La/ej60;->b:La/k3t0;

    iput-object p2, p0, La/ej60;->c:La/lk60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ej60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ej60;->c:La/lk60;

    .line 4
    .line 5
    iget-object p0, p0, La/ej60;->b:La/k3t0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/yi60;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/yi60;-><init>(La/lk60;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance v0, La/yi60;

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/yi60;-><init>(La/lk60;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
