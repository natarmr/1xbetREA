.class public final synthetic La/hlw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;JFJI)V
    .locals 0

    .line 2
    const/4 p7, 0x1

    iput-byte p7, p0, La/hlw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hlw;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/hlw;->b:J

    iput p4, p0, La/hlw;->c:F

    iput-wide p5, p0, La/hlw;->d:J

    return-void
.end method

.method public synthetic constructor <init>(La/xcz;JJFI)V
    .locals 0

    .line 1
    const/4 p7, 0x0

    iput-byte p7, p0, La/hlw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hlw;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/hlw;->b:J

    iput-wide p4, p0, La/hlw;->d:J

    iput p6, p0, La/hlw;->c:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/hlw;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/hlw;->e:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, La/mm40;

    .line 10
    .line 11
    move-object v7, p1

    .line 12
    check-cast v7, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-static {p1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    iget-wide v2, p0, La/hlw;->b:J

    .line 25
    .line 26
    iget v4, p0, La/hlw;->c:F

    .line 27
    .line 28
    iget-wide v5, p0, La/hlw;->d:J

    .line 29
    .line 30
    invoke-static/range {v1 .. v8}, La/u7x;->r(La/mm40;JFJLa/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    iget-object v0, p0, La/hlw;->e:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, La/xcz;

    .line 40
    .line 41
    move-object v7, p1

    .line 42
    check-cast v7, La/fet;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-static {p1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    iget-wide v2, p0, La/hlw;->b:J

    .line 55
    .line 56
    iget-wide v4, p0, La/hlw;->d:J

    .line 57
    .line 58
    iget v6, p0, La/hlw;->c:F

    .line 59
    .line 60
    invoke-static/range {v1 .. v8}, La/dwi0;->q(La/xcz;JJFLa/fet;I)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
