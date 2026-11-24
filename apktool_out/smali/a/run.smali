.class public final La/run;
.super La/yyb0;
.source "SourceFile"


# instance fields
.field public final g:La/dvn;


# direct methods
.method public constructor <init>(La/dvn;)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const-string v1, "Empty Process"

    .line 3
    .line 4
    invoke-direct {p0, p1, v0, v1}, La/yyb0;-><init>(La/dvn;ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/run;->g:La/dvn;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(JJLjava/lang/String;)La/ncq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/run;->g:La/dvn;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/dvn;->e:La/avn;

    .line 7
    .line 8
    return-object p0
.end method
