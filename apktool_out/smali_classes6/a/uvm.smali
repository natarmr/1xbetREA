.class public final synthetic La/uvm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/uum;

.field public final synthetic c:La/uum;

.field public final synthetic d:La/a2m;

.field public final synthetic e:Z

.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/uum;La/uum;La/a2m;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uvm;->a:La/mm40;

    iput-object p2, p0, La/uvm;->b:La/uum;

    iput-object p3, p0, La/uvm;->c:La/uum;

    iput-object p4, p0, La/uvm;->d:La/a2m;

    iput-boolean p5, p0, La/uvm;->e:Z

    iput-byte p6, p0, La/uvm;->f:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-byte p1, p0, La/uvm;->f:B

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, La/uvm;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/uvm;->b:La/uum;

    .line 20
    .line 21
    iget-object v2, p0, La/uvm;->c:La/uum;

    .line 22
    .line 23
    iget-object v3, p0, La/uvm;->d:La/a2m;

    .line 24
    .line 25
    iget-boolean v4, p0, La/uvm;->e:Z

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, La/fxb;->n(La/mm40;La/uum;La/uum;La/a2m;ZLa/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
