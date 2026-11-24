.class public final synthetic La/bqh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(IIJLa/mm40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, La/bqh;->a:La/mm40;

    iput p1, p0, La/bqh;->b:I

    iput-wide p3, p0, La/bqh;->c:J

    iput p2, p0, La/bqh;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/bqh;->d:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v0, p0, La/bqh;->b:I

    .line 18
    .line 19
    iget-wide v2, p0, La/bqh;->c:J

    .line 20
    .line 21
    iget-object v5, p0, La/bqh;->a:La/mm40;

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, La/vfc;->i(IIJLa/fet;La/mm40;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method
