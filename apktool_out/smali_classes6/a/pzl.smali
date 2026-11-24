.class public final synthetic La/pzl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:La/a4x;

.field public final synthetic f:Z

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/mm40;JJJLa/a4x;ZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pzl;->a:La/mm40;

    iput-wide p2, p0, La/pzl;->b:J

    iput-wide p4, p0, La/pzl;->c:J

    iput-wide p6, p0, La/pzl;->d:J

    iput-object p8, p0, La/pzl;->e:La/a4x;

    iput-boolean p9, p0, La/pzl;->f:Z

    iput-object p10, p0, La/pzl;->g:Lkotlin/jvm/functions/Function1;

    iput p11, p0, La/pzl;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/pzl;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget-object v0, p0, La/pzl;->a:La/mm40;

    .line 18
    .line 19
    iget-wide v1, p0, La/pzl;->b:J

    .line 20
    .line 21
    iget-wide v3, p0, La/pzl;->c:J

    .line 22
    .line 23
    iget-wide v5, p0, La/pzl;->d:J

    .line 24
    .line 25
    iget-object v7, p0, La/pzl;->e:La/a4x;

    .line 26
    .line 27
    iget-boolean v8, p0, La/pzl;->f:Z

    .line 28
    .line 29
    iget-object v9, p0, La/pzl;->g:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-static/range {v0 .. v11}, La/qbc;->D(La/mm40;JJJLa/a4x;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
