.class public final synthetic La/jsh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:D

.field public final synthetic c:La/t89;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:La/mm40;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(ZDLa/t89;JJLa/mm40;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/jsh0;->a:Z

    iput-wide p2, p0, La/jsh0;->b:D

    iput-object p4, p0, La/jsh0;->c:La/t89;

    iput-wide p5, p0, La/jsh0;->d:J

    iput-wide p7, p0, La/jsh0;->e:J

    iput-object p9, p0, La/jsh0;->f:La/mm40;

    iput p10, p0, La/jsh0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/jsh0;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-boolean v0, p0, La/jsh0;->a:Z

    .line 18
    .line 19
    iget-wide v1, p0, La/jsh0;->b:D

    .line 20
    .line 21
    iget-object v3, p0, La/jsh0;->c:La/t89;

    .line 22
    .line 23
    iget-wide v4, p0, La/jsh0;->d:J

    .line 24
    .line 25
    iget-wide v6, p0, La/jsh0;->e:J

    .line 26
    .line 27
    iget-object v8, p0, La/jsh0;->f:La/mm40;

    .line 28
    .line 29
    invoke-static/range {v0 .. v10}, La/t9x;->a(ZDLa/t89;JJLa/mm40;La/fet;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
