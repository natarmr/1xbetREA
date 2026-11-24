.class public final synthetic La/uhh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Long;

.field public final synthetic e:La/ugd;

.field public final synthetic f:I

.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(JZJLjava/lang/Long;La/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/uhh;->a:J

    iput-boolean p3, p0, La/uhh;->b:Z

    iput-wide p4, p0, La/uhh;->c:J

    iput-object p6, p0, La/uhh;->d:Ljava/lang/Long;

    iput-object p7, p0, La/uhh;->e:La/ugd;

    iput p8, p0, La/uhh;->f:I

    iput-byte p9, p0, La/uhh;->g:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/uhh;->f:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-wide v0, p0, La/uhh;->a:J

    .line 18
    .line 19
    iget-boolean v2, p0, La/uhh;->b:Z

    .line 20
    .line 21
    iget-wide v3, p0, La/uhh;->c:J

    .line 22
    .line 23
    iget-object v5, p0, La/uhh;->d:Ljava/lang/Long;

    .line 24
    .line 25
    iget-object v6, p0, La/uhh;->e:La/ugd;

    .line 26
    .line 27
    iget-byte v9, p0, La/uhh;->g:B

    .line 28
    .line 29
    invoke-static/range {v0 .. v9}, La/yhh;->a(JZJLjava/lang/Long;La/ugd;La/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
