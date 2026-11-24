.class public final synthetic La/lp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/m0x;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Z

.field public final synthetic g:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;La/m0x;JJZLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lp0;->a:La/mm40;

    iput-object p2, p0, La/lp0;->b:Ljava/lang/String;

    iput-object p3, p0, La/lp0;->c:La/m0x;

    iput-wide p4, p0, La/lp0;->d:J

    iput-wide p6, p0, La/lp0;->e:J

    iput-boolean p8, p0, La/lp0;->f:Z

    iput-object p9, p0, La/lp0;->g:Lkotlin/jvm/functions/Function0;

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
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v10

    .line 14
    iget-object v0, p0, La/lp0;->a:La/mm40;

    .line 15
    .line 16
    iget-object v1, p0, La/lp0;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, La/lp0;->c:La/m0x;

    .line 19
    .line 20
    iget-wide v3, p0, La/lp0;->d:J

    .line 21
    .line 22
    iget-wide v5, p0, La/lp0;->e:J

    .line 23
    .line 24
    iget-boolean v7, p0, La/lp0;->f:Z

    .line 25
    .line 26
    iget-object v8, p0, La/lp0;->g:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    invoke-static/range {v0 .. v10}, La/xia0;->B(La/mm40;Ljava/lang/String;La/m0x;JJZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method
