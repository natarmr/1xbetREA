.class public final synthetic La/m00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d280;


# direct methods
.method public synthetic constructor <init>(La/d280;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m00;->a:B

    iput-object p1, p0, La/m00;->b:La/d280;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/m00;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/m00;->b:La/d280;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/u6n;

    .line 9
    .line 10
    sget-object v1, La/d4d;->Q1:La/d4d;

    .line 11
    .line 12
    sget-object v2, La/w6n;->h:La/w6n;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, La/u6n;

    .line 19
    .line 20
    sget-object v1, La/d4d;->r:La/d4d;

    .line 21
    .line 22
    sget-object v2, La/w6n;->f:La/w6n;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/u6n;

    .line 29
    .line 30
    sget-object v1, La/d4d;->Q1:La/d4d;

    .line 31
    .line 32
    sget-object v2, La/w6n;->f:La/w6n;

    .line 33
    .line 34
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
