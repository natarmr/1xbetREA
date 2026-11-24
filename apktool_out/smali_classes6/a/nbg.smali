.class public final synthetic La/nbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/yhg0;

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:La/y9q0;

.field public final synthetic h:La/y9q0;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/yhg0;La/mm40;Ljava/lang/String;ZJJLa/y9q0;La/y9q0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nbg;->a:La/yhg0;

    iput-object p2, p0, La/nbg;->b:La/mm40;

    iput-object p3, p0, La/nbg;->c:Ljava/lang/String;

    iput-boolean p4, p0, La/nbg;->d:Z

    iput-wide p5, p0, La/nbg;->e:J

    iput-wide p7, p0, La/nbg;->f:J

    iput-object p9, p0, La/nbg;->g:La/y9q0;

    iput-object p10, p0, La/nbg;->h:La/y9q0;

    iput p11, p0, La/nbg;->i:I

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
    iget p1, p0, La/nbg;->i:I

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
    iget-object v0, p0, La/nbg;->a:La/yhg0;

    .line 18
    .line 19
    iget-object v1, p0, La/nbg;->b:La/mm40;

    .line 20
    .line 21
    iget-object v2, p0, La/nbg;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v3, p0, La/nbg;->d:Z

    .line 24
    .line 25
    iget-wide v4, p0, La/nbg;->e:J

    .line 26
    .line 27
    iget-wide v6, p0, La/nbg;->f:J

    .line 28
    .line 29
    iget-object v8, p0, La/nbg;->g:La/y9q0;

    .line 30
    .line 31
    iget-object v9, p0, La/nbg;->h:La/y9q0;

    .line 32
    .line 33
    invoke-static/range {v0 .. v11}, La/mbc;->g(La/yhg0;La/mm40;Ljava/lang/String;ZJJLa/y9q0;La/y9q0;La/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
