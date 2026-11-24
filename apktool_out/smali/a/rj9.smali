.class public final synthetic La/rj9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sj9;

.field public final synthetic c:La/tj9;


# direct methods
.method public synthetic constructor <init>(La/sj9;La/tj9;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rj9;->a:B

    iput-object p1, p0, La/rj9;->b:La/sj9;

    iput-object p2, p0, La/rj9;->c:La/tj9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rj9;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/rj9;->c:La/tj9;

    .line 4
    .line 5
    iget-object p0, p0, La/rj9;->b:La/sj9;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, p1, p2}, La/sj9;->f(La/tj9;II)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    invoke-virtual {p0, v1, p1, p2}, La/sj9;->f(La/tj9;II)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
