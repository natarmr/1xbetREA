.class public final synthetic La/dtm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/kpm;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/kpm;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 0

    .line 1
    const/4 p6, 0x0

    iput-byte p6, p0, La/dtm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dtm;->b:La/mm40;

    iput-object p2, p0, La/dtm;->e:La/kpm;

    iput-object p3, p0, La/dtm;->c:Ljava/lang/String;

    iput-object p4, p0, La/dtm;->d:Ljava/lang/String;

    iput-boolean p5, p0, La/dtm;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;La/kpm;ZI)V
    .locals 0

    .line 2
    const/4 p6, 0x1

    iput-byte p6, p0, La/dtm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dtm;->b:La/mm40;

    iput-object p2, p0, La/dtm;->c:Ljava/lang/String;

    iput-object p3, p0, La/dtm;->d:Ljava/lang/String;

    iput-object p4, p0, La/dtm;->e:La/kpm;

    iput-boolean p5, p0, La/dtm;->f:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/dtm;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v4, p1

    .line 8
    check-cast v4, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, La/dtm;->e:La/kpm;

    .line 20
    .line 21
    iget-object v5, p0, La/dtm;->b:La/mm40;

    .line 22
    .line 23
    iget-object v6, p0, La/dtm;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v7, p0, La/dtm;->d:Ljava/lang/String;

    .line 26
    .line 27
    iget-boolean v8, p0, La/dtm;->f:Z

    .line 28
    .line 29
    invoke-static/range {v2 .. v8}, La/ibc;->a(ILa/kpm;La/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    move-object v2, p1

    .line 36
    check-cast v2, La/fet;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, La/x8x;->L(I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v1, p0, La/dtm;->e:La/kpm;

    .line 48
    .line 49
    iget-object v3, p0, La/dtm;->b:La/mm40;

    .line 50
    .line 51
    iget-object v4, p0, La/dtm;->c:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v5, p0, La/dtm;->d:Ljava/lang/String;

    .line 54
    .line 55
    iget-boolean v6, p0, La/dtm;->f:Z

    .line 56
    .line 57
    invoke-static/range {v0 .. v6}, La/hkb;->a(ILa/kpm;La/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
