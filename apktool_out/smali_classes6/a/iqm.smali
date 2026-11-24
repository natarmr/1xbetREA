.class public final synthetic La/iqm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:La/ugg0;

.field public final synthetic d:J

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(ILa/ugg0;JIIB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/iqm;->a:B

    iput p1, p0, La/iqm;->b:I

    iput-object p2, p0, La/iqm;->c:La/ugg0;

    iput-wide p3, p0, La/iqm;->d:J

    iput p5, p0, La/iqm;->e:I

    iput p6, p0, La/iqm;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/iqm;->a:B

    .line 2
    .line 3
    iget v1, p0, La/iqm;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v7, p1

    .line 9
    check-cast v7, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget v2, p0, La/iqm;->b:I

    .line 23
    .line 24
    iget-object v3, p0, La/iqm;->c:La/ugg0;

    .line 25
    .line 26
    iget-wide v4, p0, La/iqm;->d:J

    .line 27
    .line 28
    iget v6, p0, La/iqm;->e:I

    .line 29
    .line 30
    invoke-static/range {v2 .. v8}, La/ibc;->L(ILa/ugg0;JILa/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v5, p1

    .line 37
    check-cast v5, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    or-int/lit8 p1, v1, 0x1

    .line 45
    .line 46
    invoke-static {p1}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    iget v0, p0, La/iqm;->b:I

    .line 51
    .line 52
    iget-object v1, p0, La/iqm;->c:La/ugg0;

    .line 53
    .line 54
    iget-wide v2, p0, La/iqm;->d:J

    .line 55
    .line 56
    iget v4, p0, La/iqm;->e:I

    .line 57
    .line 58
    invoke-static/range {v0 .. v6}, La/ibc;->L(ILa/ugg0;JILa/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
