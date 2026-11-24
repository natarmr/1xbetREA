.class public final synthetic La/eee;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:La/nrq;

.field public final synthetic e:J

.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(La/mm40;IJLa/nrq;JII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/eee;->a:La/mm40;

    iput p2, p0, La/eee;->b:I

    iput-wide p3, p0, La/eee;->c:J

    iput-object p5, p0, La/eee;->d:La/nrq;

    iput-wide p6, p0, La/eee;->e:J

    iput-byte p8, p0, La/eee;->f:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x7

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v9

    .line 14
    iget-object v0, p0, La/eee;->a:La/mm40;

    .line 15
    .line 16
    iget v1, p0, La/eee;->b:I

    .line 17
    .line 18
    iget-wide v2, p0, La/eee;->c:J

    .line 19
    .line 20
    iget-object v4, p0, La/eee;->d:La/nrq;

    .line 21
    .line 22
    iget-wide v5, p0, La/eee;->e:J

    .line 23
    .line 24
    iget-byte v7, p0, La/eee;->f:B

    .line 25
    .line 26
    invoke-static/range {v0 .. v9}, La/zjb;->c(La/mm40;IJLa/nrq;JILa/fet;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method
