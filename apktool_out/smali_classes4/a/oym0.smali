.class public final synthetic La/oym0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:J

.field public final synthetic c:La/lh80;

.field public final synthetic d:I

.field public final synthetic e:B


# direct methods
.method public synthetic constructor <init>(La/mm40;JLa/lh80;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/oym0;->a:La/mm40;

    iput-wide p2, p0, La/oym0;->b:J

    iput-object p4, p0, La/oym0;->c:La/lh80;

    iput p5, p0, La/oym0;->d:I

    iput-byte p6, p0, La/oym0;->e:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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
    iget p1, p0, La/oym0;->d:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, La/oym0;->a:La/mm40;

    .line 18
    .line 19
    iget-wide v1, p0, La/oym0;->b:J

    .line 20
    .line 21
    iget-object v3, p0, La/oym0;->c:La/lh80;

    .line 22
    .line 23
    iget-byte v6, p0, La/oym0;->e:B

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, La/pym0;->c(La/mm40;JLa/lh80;La/fet;II)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method
