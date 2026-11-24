.class public final synthetic La/tjm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/vjm;

.field public final synthetic c:La/jwm;

.field public final synthetic d:La/jwm;

.field public final synthetic e:Z

.field public final synthetic f:J

.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/vjm;La/jwm;La/jwm;ZJII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tjm;->a:La/mm40;

    iput-object p2, p0, La/tjm;->b:La/vjm;

    iput-object p3, p0, La/tjm;->c:La/jwm;

    iput-object p4, p0, La/tjm;->d:La/jwm;

    iput-boolean p5, p0, La/tjm;->e:Z

    iput-wide p6, p0, La/tjm;->f:J

    iput-byte p9, p0, La/tjm;->g:B

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
    const/16 p1, 0x1b1

    .line 10
    .line 11
    invoke-static {p1}, La/x8x;->L(I)I

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    iget-object v0, p0, La/tjm;->a:La/mm40;

    .line 16
    .line 17
    iget-object v1, p0, La/tjm;->b:La/vjm;

    .line 18
    .line 19
    iget-object v2, p0, La/tjm;->c:La/jwm;

    .line 20
    .line 21
    iget-object v3, p0, La/tjm;->d:La/jwm;

    .line 22
    .line 23
    iget-boolean v4, p0, La/tjm;->e:Z

    .line 24
    .line 25
    iget-wide v5, p0, La/tjm;->f:J

    .line 26
    .line 27
    iget-byte v9, p0, La/tjm;->g:B

    .line 28
    .line 29
    invoke-static/range {v0 .. v9}, La/ulb;->m(La/mm40;La/vjm;La/jwm;La/jwm;ZJLa/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
