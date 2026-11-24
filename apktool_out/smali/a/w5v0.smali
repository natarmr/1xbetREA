.class public final synthetic La/w5v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/w5v0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-byte p0, p0, La/w5v0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/p5v0;

    .line 7
    .line 8
    check-cast p2, La/p5v0;

    .line 9
    .line 10
    iget-object p0, p1, La/p5v0;->a:La/q5v0;

    .line 11
    .line 12
    iget p0, p0, La/q5v0;->b:I

    .line 13
    .line 14
    iget-object p1, p2, La/p5v0;->a:La/q5v0;

    .line 15
    .line 16
    iget p1, p1, La/q5v0;->b:I

    .line 17
    .line 18
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_0
    check-cast p1, La/o5v0;

    .line 24
    .line 25
    check-cast p2, La/o5v0;

    .line 26
    .line 27
    iget-wide p0, p1, La/o5v0;->b:J

    .line 28
    .line 29
    iget-wide v0, p2, La/o5v0;->b:J

    .line 30
    .line 31
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
