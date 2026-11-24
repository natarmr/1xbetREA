.class public final synthetic La/hym0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/qym0;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:I

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/qym0;JZZZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hym0;->a:La/mm40;

    iput-object p2, p0, La/hym0;->b:La/qym0;

    iput-wide p3, p0, La/hym0;->c:J

    iput-boolean p5, p0, La/hym0;->d:Z

    iput-boolean p6, p0, La/hym0;->e:Z

    iput-boolean p7, p0, La/hym0;->f:Z

    iput-object p8, p0, La/hym0;->g:Lkotlin/jvm/functions/Function1;

    iput p9, p0, La/hym0;->h:I

    iput-byte p10, p0, La/hym0;->i:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    iget p1, p0, La/hym0;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, La/hym0;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/hym0;->b:La/qym0;

    .line 20
    .line 21
    iget-wide v2, p0, La/hym0;->c:J

    .line 22
    .line 23
    iget-boolean v4, p0, La/hym0;->d:Z

    .line 24
    .line 25
    iget-boolean v5, p0, La/hym0;->e:Z

    .line 26
    .line 27
    iget-boolean v6, p0, La/hym0;->f:Z

    .line 28
    .line 29
    iget-object v7, p0, La/hym0;->g:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iget-byte v10, p0, La/hym0;->i:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v10}, La/iym0;->b(La/mm40;La/qym0;JZZZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
