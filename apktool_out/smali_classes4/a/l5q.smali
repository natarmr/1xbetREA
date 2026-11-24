.class public final synthetic La/l5q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p5q;


# direct methods
.method public synthetic constructor <init>(La/p5q;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l5q;->a:B

    iput-object p1, p0, La/l5q;->b:La/p5q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/l5q;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l5q;->b:La/p5q;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/m5q;->o2:La/nek;

    .line 9
    .line 10
    iget-object p0, p0, La/p5q;->b:La/cny;

    .line 11
    .line 12
    iget-byte p0, p0, La/cny;->a:B

    .line 13
    .line 14
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    sget-object v0, La/m5q;->o2:La/nek;

    .line 20
    .line 21
    iget-object p0, p0, La/p5q;->a:La/nmy;

    .line 22
    .line 23
    iget-byte p0, p0, La/nmy;->a:B

    .line 24
    .line 25
    goto :goto_0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
