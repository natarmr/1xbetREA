.class public final synthetic La/wan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;JJFIB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/wan;->a:B

    iput-object p1, p0, La/wan;->b:Ljava/lang/Integer;

    iput-wide p2, p0, La/wan;->c:J

    iput-wide p4, p0, La/wan;->d:J

    iput p6, p0, La/wan;->e:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/wan;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x6001

    .line 15
    .line 16
    invoke-static {p1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    iget-object v1, p0, La/wan;->b:Ljava/lang/Integer;

    .line 21
    .line 22
    iget-wide v2, p0, La/wan;->c:J

    .line 23
    .line 24
    iget-wide v4, p0, La/wan;->d:J

    .line 25
    .line 26
    iget v6, p0, La/wan;->e:F

    .line 27
    .line 28
    invoke-static/range {v1 .. v8}, La/mrv;->b0(Ljava/lang/Integer;JJFLa/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    move-object v6, p1

    .line 35
    check-cast v6, La/fet;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/16 p1, 0x6001

    .line 43
    .line 44
    invoke-static {p1}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    iget-object v0, p0, La/wan;->b:Ljava/lang/Integer;

    .line 49
    .line 50
    iget-wide v1, p0, La/wan;->c:J

    .line 51
    .line 52
    iget-wide v3, p0, La/wan;->d:J

    .line 53
    .line 54
    iget v5, p0, La/wan;->e:F

    .line 55
    .line 56
    invoke-static/range {v0 .. v7}, La/epv0;->M(Ljava/lang/Integer;JJFLa/fet;I)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
