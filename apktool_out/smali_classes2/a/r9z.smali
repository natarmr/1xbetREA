.class public final La/r9z;
.super La/ng80;
.source "SourceFile"


# static fields
.field public static final synthetic n:[La/iiy;


# instance fields
.field public final h:La/wqe0;

.field public final i:La/f7u;

.field public final j:La/cu00;

.field public final k:La/lfy;

.field public final l:La/xt00;

.field public final m:La/g93;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/r9z;

    .line 4
    .line 5
    const-string v2, "binaryClasses"

    .line 6
    .line 7
    const-string v3, "getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm()Ljava/util/Map;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/r9z;->n:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/f7u;La/wqe0;)V
    .locals 5

    .line 1
    iget-object v0, p1, La/f7u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/v7i;

    .line 4
    .line 5
    iget-object v1, v0, La/v7i;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/zm40;

    .line 8
    .line 9
    iget-object v2, p2, La/wqe0;->a:La/swq;

    .line 10
    .line 11
    invoke-direct {p0, v1, v2}, La/ng80;-><init>(La/ym40;La/swq;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, La/r9z;->h:La/wqe0;

    .line 15
    .line 16
    const/4 v1, 0x6

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {p1, p0, v2, v1}, La/f7k;->G(La/f7u;La/vlc;La/mqe0;I)La/f7u;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/r9z;->i:La/f7u;

    .line 23
    .line 24
    iget-object v0, v0, La/v7i;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/jfk;

    .line 27
    .line 28
    invoke-virtual {v0}, La/jfk;->c()La/f6i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, La/f6i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La/lwf;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v0, La/vd40;->g:La/vd40;

    .line 40
    .line 41
    iget-object v0, p1, La/f7u;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/v7i;

    .line 44
    .line 45
    iget-object v1, v0, La/v7i;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, La/eu00;

    .line 48
    .line 49
    new-instance v3, La/q9z;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, p0, v4}, La/q9z;-><init>(La/r9z;B)V

    .line 53
    .line 54
    .line 55
    new-instance v4, La/cu00;

    .line 56
    .line 57
    invoke-direct {v4, v1, v3}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 58
    .line 59
    .line 60
    iput-object v4, p0, La/r9z;->j:La/cu00;

    .line 61
    .line 62
    new-instance v3, La/lfy;

    .line 63
    .line 64
    invoke-direct {v3, p1, p2, p0}, La/lfy;-><init>(La/f7u;La/wqe0;La/r9z;)V

    .line 65
    .line 66
    .line 67
    iput-object v3, p0, La/r9z;->k:La/lfy;

    .line 68
    .line 69
    new-instance v3, La/q9z;

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    invoke-direct {v3, p0, v4}, La/q9z;-><init>(La/r9z;B)V

    .line 73
    .line 74
    .line 75
    sget-object v4, La/iun;->a:La/iun;

    .line 76
    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    new-instance v2, La/xt00;

    .line 80
    .line 81
    invoke-direct {v2, v1, v3, v4}, La/xt00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iput-object v2, p0, La/r9z;->l:La/xt00;

    .line 85
    .line 86
    iget-object v0, v0, La/v7i;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, La/cgx0;

    .line 89
    .line 90
    iget-boolean v0, v0, La/cgx0;->b:Z

    .line 91
    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    sget-object p1, La/ujn;->c:La/f93;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    invoke-static {p1, p2}, La/r8x;->W(La/f7u;La/m8y;)La/j9z;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :goto_0
    iput-object p1, p0, La/r9z;->m:La/g93;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_1
    const/16 p0, 0x1b

    .line 105
    .line 106
    invoke-static {p0}, La/eu00;->a(I)V

    .line 107
    .line 108
    .line 109
    throw v2
.end method


# virtual methods
.method public final b()La/gmk0;
    .locals 2

    .line 1
    new-instance v0, La/jru;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/jru;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    iget-object p0, p0, La/r9z;->m:La/g93;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy Java package fragment: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ng80;->f:La/swq;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " of module "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/r9z;->i:La/f7u;

    .line 19
    .line 20
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/v7i;

    .line 23
    .line 24
    iget-object p0, p0, La/v7i;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/zm40;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public final y()La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/r9z;->k:La/lfy;

    .line 2
    .line 3
    return-object p0
.end method
