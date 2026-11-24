.class public final synthetic La/gws0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s180;


# direct methods
.method public synthetic constructor <init>(La/s180;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gws0;->a:B

    iput-object p1, p0, La/gws0;->b:La/s180;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/gws0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gws0;->b:La/s180;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/u6n;

    .line 9
    .line 10
    sget-object v1, La/d4d;->t:La/d4d;

    .line 11
    .line 12
    sget-object v2, La/w6n;->h:La/w6n;

    .line 13
    .line 14
    iget-object p0, p0, La/s180;->d:La/c280;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, La/u6n;

    .line 21
    .line 22
    sget-object v1, La/d4d;->t:La/d4d;

    .line 23
    .line 24
    sget-object v2, La/w6n;->h:La/w6n;

    .line 25
    .line 26
    iget-object p0, p0, La/s180;->b:La/c280;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, p0}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
