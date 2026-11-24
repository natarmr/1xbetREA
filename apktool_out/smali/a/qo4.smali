.class public final synthetic La/qo4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uo4;


# direct methods
.method public synthetic constructor <init>(La/uo4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qo4;->a:B

    iput-object p1, p0, La/qo4;->b:La/uo4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qo4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qo4;->b:La/uo4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/so4;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, La/so4;-><init>(La/uo4;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/so4;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, v1}, La/so4;-><init>(La/uo4;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/lo4;

    .line 23
    .line 24
    new-instance v1, La/ro4;

    .line 25
    .line 26
    invoke-direct {v1, p0}, La/ro4;-><init>(La/uo4;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, La/lo4;-><init>(La/ro4;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
