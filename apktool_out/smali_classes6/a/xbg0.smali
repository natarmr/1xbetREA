.class public final synthetic La/xbg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/j6q0;

.field public final synthetic b:La/q7q0;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/j6q0;La/q7q0;ZZZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xbg0;->a:La/j6q0;

    iput-object p2, p0, La/xbg0;->b:La/q7q0;

    iput-boolean p3, p0, La/xbg0;->c:Z

    iput-boolean p4, p0, La/xbg0;->d:Z

    iput-boolean p5, p0, La/xbg0;->e:Z

    iput-object p6, p0, La/xbg0;->f:Lkotlin/jvm/functions/Function1;

    iput p7, p0, La/xbg0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/xbg0;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v0, p0, La/xbg0;->a:La/j6q0;

    .line 18
    .line 19
    iget-object v1, p0, La/xbg0;->b:La/q7q0;

    .line 20
    .line 21
    iget-boolean v2, p0, La/xbg0;->c:Z

    .line 22
    .line 23
    iget-boolean v3, p0, La/xbg0;->d:Z

    .line 24
    .line 25
    iget-boolean v4, p0, La/xbg0;->e:Z

    .line 26
    .line 27
    iget-object v5, p0, La/xbg0;->f:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, La/g7x;->a(La/j6q0;La/q7q0;ZZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
